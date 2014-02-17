package com.ostapovych.vasyl.java.queryfactory.abstractquery;


import com.ostapovych.vasyl.java.queryfactory.errors.ValidatorError;

import java.util.Map;

public abstract class AbstractInsert extends Script {
    public static final String DELIMITER =",";
    protected Map<String,String> values;

    public AbstractInsert(String tableName, Map<String,String> values) {
        super(tableName);
        this.values = values;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Map getValues() {
        return values;
    }

    public void setValues(Map<String,String> values) {
        this.values = values;
    }
    @Override
    public String getGeneratedScript() throws ValidatorError {
        return this._getGeneratedScript();
    }

    protected abstract String _getGeneratedScript() throws ValidatorError;
}
