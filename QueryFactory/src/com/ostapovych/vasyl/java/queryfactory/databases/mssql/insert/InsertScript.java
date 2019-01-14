package com.ostapovych.vasyl.java.queryfactory.databases.mssql.insert;

import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractInsert;

import java.util.Map;


public class InsertScript extends AbstractInsert {

    public InsertScript(String tableName, Map<String, String> values) {
        super(tableName, values);
    }

    protected String _getGeneratedScript(){
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ").append(tableName);
        sb.append("(");
        String [] fields = new String[values.keySet().size()];
        fields = values.keySet().toArray(fields);
        for (int i=0;i<fields.length;i++){
            String field = fields[i];
            sb.append(field);
            if (i!=(fields.length-1)) sb.append(DELIMITER);
        }
        sb.append(")");
        sb.append(" values (");
        for (int i=0;i<fields.length;i++){
            String value = this.values.get(fields[i]);
            sb.append(value);
            if (i!=(fields.length-1)) sb.append(DELIMITER);

        }
        sb.append(")");
        return sb.toString();
    }


}
