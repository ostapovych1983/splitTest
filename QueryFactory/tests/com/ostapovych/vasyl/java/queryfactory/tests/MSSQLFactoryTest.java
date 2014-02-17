package com.ostapovych.vasyl.java.queryfactory.tests;

import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractDeleteScript;
import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractSelectScript;
import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractUpdateScript;
import com.ostapovych.vasyl.java.queryfactory.components.booleanoperation.AND;
import com.ostapovych.vasyl.java.queryfactory.components.booleanoperation.OR;
import com.ostapovych.vasyl.java.queryfactory.components.conditionoperaions.Equals;
import com.ostapovych.vasyl.java.queryfactory.components.conditions.Condition;
import com.ostapovych.vasyl.java.queryfactory.components.joins.JoinCondition;
import com.ostapovych.vasyl.java.queryfactory.factories.MSSQLFactory;
import com.ostapovych.vasyl.java.queryfactory.interfaces.Factory;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MSSQLFactoryTest extends TestCase {
    private Factory factory = new MSSQLFactory();

    @Test
    public void testGetInsertScript() throws Exception {

    }

    @Test
    public void testGetUpdateScript() throws Exception {
        final String tableName = "[RefKontragents]";
        final String [] fields = {
                "[id]","[EDRPO]","[IPN]","[FullName]"
                ,"[ShortName]","[VATNum]","[UserID]"
                ,"[LastUpdated]"
        };
        final Map<String,String> values = new HashMap<String, String>();
        values.put("[EDRPO]","'000000'");
        values.put("[IPN]","'11111'");
        values.put("[FullName]","'22222'");
        values.put("[ShortName]","'33333'");
        values.put("[VATNum]","'444444'");
        values.put("[UserID]","'2345'");
        values.put("[LastUpdated]","GETDATE()");
        AbstractUpdateScript script = factory.getUpdateScript(tableName,values);
        System.out.println(script.getGeneratedScript());
    }

    @Test
    public void testGetDeleteScript() throws Exception {
        final String tableName = "[RefKontragents]";
        AbstractDeleteScript script = factory.getDeleteScript(tableName);
        Condition condition = new Condition(new AND(),tableName,"[id]",new Equals(),"5");
        script.setConditions(condition);
        System.out.println(script.getGeneratedScript());
    }

    @Test
    public void testSelectScript() throws Exception{
        final String tableName = "[RefKontragents]";
        final String [] fields = {
                "[id]","[EDRPO]","[IPN]","[FullName]"
                ,"[ShortName]","[VATNum]","[UserID]"
                ,"[LastUpdated]"
        } ;
        AbstractSelectScript script = factory.getSelectScript(tableName,fields);
       // List<JoinCondition> joinFields = new ArrayList<JoinCondition>();
        /*joinFields.add(new JoinCondition(new AND(),controllerTableName,"PHONEID", new Equals(),phoneTableName,"ID"));
        script.addLeftJoin(phoneTableName, joinFields);*/
        script.addCondition(new AND(),tableName,"[id]",new Equals(),"2");
        System.out.println(script.getGeneratedScript());

    }
}
