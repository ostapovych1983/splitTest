package com.ostapovych.vasyl.java.queryfactory.interfaces;


import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractDeleteScript;
import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractInsert;
import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractSelectScript;
import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractUpdateScript;

import java.util.Map;

public interface Factory {
    public AbstractInsert getInsertScript(String tableName, Map<String,String> values);
    public AbstractUpdateScript getUpdateScript(String tableName, Map<String, String> columnWithValue);
    public AbstractDeleteScript getDeleteScript(String tableName);
    public AbstractSelectScript getSelectScript(String tableName,String [] fields);
}
