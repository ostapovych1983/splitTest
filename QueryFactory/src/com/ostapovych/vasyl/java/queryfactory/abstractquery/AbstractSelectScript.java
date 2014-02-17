package com.ostapovych.vasyl.java.queryfactory.abstractquery;

import com.ostapovych.vasyl.java.queryfactory.components.booleanoperation.BooleanOperation;
import com.ostapovych.vasyl.java.queryfactory.components.conditionoperaions.ConditionOperation;
import com.ostapovych.vasyl.java.queryfactory.components.conditions.Condition;
import com.ostapovych.vasyl.java.queryfactory.components.joins.JoinCondition;
import com.ostapovych.vasyl.java.queryfactory.errors.ValidatorError;
import com.ostapovych.vasyl.java.queryfactory.components.joins.Join;

import java.util.List;

public abstract class AbstractSelectScript extends Script {
    protected String [] fields;

    protected AbstractSelectScript(String tableName,String[] fields) {
        super(tableName);
        this.fields = fields;
    }

    public String getGeneratedScript()throws ValidatorError{
        return this._getGeneratedScript();
    }

    public void addLeftJoin(String tableToJoin,List<JoinCondition> joinFields){
        Join j = new Join(this.tableName,tableToJoin,Join.LEFT_JOIN_TYPE);
        for (JoinCondition jf:joinFields) {
            j.addFieldCondition(jf.getBooleanOperation(),jf.getSourceTableName(),jf.getTableField1()
                    ,jf.getConditionOperation(),jf.getDestinationTableName(),jf.getTableField2());
        }
        this.joins.add(j);
    }

    public void addCondition(BooleanOperation booleanOperation,String fromTable, String field,  ConditionOperation condition, String value){
        Condition c = new Condition(booleanOperation,fromTable,field,condition,value);
        this.conditions.add(c);
    }

    protected abstract String _getGeneratedScript();

}
