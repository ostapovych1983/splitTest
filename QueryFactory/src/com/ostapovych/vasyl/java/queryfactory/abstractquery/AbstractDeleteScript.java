package com.ostapovych.vasyl.java.queryfactory.abstractquery;

import com.ostapovych.vasyl.java.queryfactory.components.conditions.Condition;
import com.ostapovych.vasyl.java.queryfactory.errors.ValidatorError;

import java.util.List;

public abstract class AbstractDeleteScript extends Script {
    protected List<Condition> conditions;
    protected String tableName;

    public AbstractDeleteScript(String tableName) {
       super(tableName);
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getGeneratedScript()throws ValidatorError{
        return this._getGeneratedScript();
    }
    protected abstract String _getGeneratedScript() throws ValidatorError;
}
