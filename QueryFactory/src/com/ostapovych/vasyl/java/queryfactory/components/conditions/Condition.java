package com.ostapovych.vasyl.java.queryfactory.components.conditions;

import com.ostapovych.vasyl.java.queryfactory.components.booleanoperation.BooleanOperation;
import com.ostapovych.vasyl.java.queryfactory.components.conditionoperaions.ConditionOperation;

public class Condition {
     private BooleanOperation booleanOperation;
     private String field;
     private String value;
     private ConditionOperation condition;
     private String fromTable;

    public Condition(BooleanOperation booleanOperation,String fromTable, String field, ConditionOperation condition, String value) {
        this.booleanOperation = booleanOperation;
        this.field = field;
        this.value = value;
        this.condition = condition;
        this.fromTable = fromTable;
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getFromTable() {
        return fromTable;
    }

    public void setFromTable(String fromTable) {
        this.fromTable = fromTable;
    }

    public BooleanOperation getBooleanOperation() {
        return booleanOperation;
    }

    public void setBooleanOperation(BooleanOperation booleanOperation) {
        this.booleanOperation = booleanOperation;
    }

    public ConditionOperation getCondition() {
        return condition;
    }

    public void setCondition(ConditionOperation condition) {
        this.condition = condition;
    }
}
