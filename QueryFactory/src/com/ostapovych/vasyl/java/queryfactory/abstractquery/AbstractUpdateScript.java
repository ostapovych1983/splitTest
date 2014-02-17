package com.ostapovych.vasyl.java.queryfactory.abstractquery;

import com.ostapovych.vasyl.java.queryfactory.errors.ValidatorError;

import java.util.Map;

public abstract class AbstractUpdateScript extends Script {
    protected Map<String,String> columnWithValue;
    public static final String DELIMITER =",";
    public AbstractUpdateScript
            (String tableName, Map<String, String> columnWithValue) {
        super(tableName);
        this.columnWithValue = columnWithValue;
    }

    @Override
    public String getGeneratedScript() throws ValidatorError {
        return this._getGeneratedScript();
    }
    protected abstract String _getGeneratedScript() throws ValidatorError;

}
