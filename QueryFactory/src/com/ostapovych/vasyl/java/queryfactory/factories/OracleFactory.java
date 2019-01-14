package com.ostapovych.vasyl.java.queryfactory.factories;

import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractDeleteScript;
import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractInsert;
import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractSelectScript;
import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractUpdateScript;
import com.ostapovych.vasyl.java.queryfactory.databases.oracle.delete.DeleteScript;
import com.ostapovych.vasyl.java.queryfactory.databases.oracle.insert.InsertScript;
import com.ostapovych.vasyl.java.queryfactory.databases.oracle.select.SelectScript;
import com.ostapovych.vasyl.java.queryfactory.databases.oracle.update.UpdateScript;
import com.ostapovych.vasyl.java.queryfactory.interfaces.Factory;

import java.util.Map;

public class OracleFactory implements Factory {

    @Override
    public AbstractInsert getInsertScript(String tableName, Map<String, String> values) {
        return new InsertScript(tableName,values);
    }

    @Override
    public AbstractUpdateScript getUpdateScript(String tableName, Map<String, String> columnWithValue){
        return new UpdateScript(tableName,columnWithValue);
    }

    @Override
    public AbstractDeleteScript getDeleteScript(String tableName) {
        return new DeleteScript(tableName);
    }

    @Override
    public AbstractSelectScript getSelectScript(String tableName, String[] fields) {
        return new SelectScript(tableName,fields);
    }
}
