package com.ostapovych.vasyl.java.queryfactory.tests;

import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractSelectScript;
import com.ostapovych.vasyl.java.queryfactory.components.booleanoperation.AND;
import com.ostapovych.vasyl.java.queryfactory.components.booleanoperation.OR;
import com.ostapovych.vasyl.java.queryfactory.components.conditionoperaions.Equals;
import com.ostapovych.vasyl.java.queryfactory.components.joins.JoinCondition;
import com.ostapovych.vasyl.java.queryfactory.components.limitselect.DISTINCT;
import com.ostapovych.vasyl.java.queryfactory.components.pseudonyms.Pseudonyms;
import com.ostapovych.vasyl.java.queryfactory.factories.OracleFactory;
import com.ostapovych.vasyl.java.queryfactory.interfaces.Factory;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OracleFactoryTest extends TestCase {
    Factory factory = new OracleFactory();

    @Test
    public void testGetInsertScript() throws Exception {

    }

    @Test
    public void testGetUpdateScript() throws Exception {

    }

    @Test
    public void testGetDeleteScript() throws Exception {

    }

    @Test
    public void testGetSelectScript() throws Exception {
        String tableName = "Addresses";
        String [] fields = {"id"};

        AbstractSelectScript script = this.factory.getSelectScript(tableName,fields);
        script.addCondition(new OR(),tableName, "ID",new Equals(), "1");
        script.addCondition(new OR(),tableName,"ID", new Equals(), "2");
        script.addCondition(new OR(),tableName,"ID", new Equals(), "3");
        script.addCondition(new OR(),tableName,"ID", new Equals(), "4");
        List<JoinCondition> joinConditions = new ArrayList<JoinCondition>();
        joinConditions.add(new JoinCondition(new AND(),"Addresses","streetID",new Equals(),"Streets","id"));
        script.addLeftJoin("Streets",joinConditions);
        script.setLimit(new DISTINCT());
        System.out.println(script.getGeneratedScript());
    }
    @Test
    public void testSelectScript() throws Exception{
        String controllerTableName = "CONTROLLERS";
        String phoneTableName = "PHONES";
        String fields [] = {"ID","NAME","PHONEID"};
        AbstractSelectScript script = factory.getSelectScript(controllerTableName,fields);
        List<JoinCondition> joinFields = new ArrayList<JoinCondition>();
        joinFields.add(new JoinCondition(new AND(),controllerTableName,"PHONEID", new Equals(),phoneTableName,"ID"));
        script.addLeftJoin(phoneTableName, joinFields);
        script.addCondition(new AND(),phoneTableName,"SERIALNUMBER",new Equals(),"'123456789'");
        script.setLimit(new DISTINCT());
        System.out.println(script.getGeneratedScript());
        //return script.getGeneratedScript();
    }
}
