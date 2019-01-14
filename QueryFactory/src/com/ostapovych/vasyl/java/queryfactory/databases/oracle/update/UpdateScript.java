package com.ostapovych.vasyl.java.queryfactory.databases.oracle.update;


import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractUpdateScript;
import com.ostapovych.vasyl.java.queryfactory.errors.ValidatorError;

import java.util.Map;

public class UpdateScript extends AbstractUpdateScript {
    public UpdateScript(String tableName, Map<String, String> columnWithValue) {
        super(tableName, columnWithValue);
    }
    @Override
    protected String _getGeneratedScript() throws ValidatorError {
        StringBuilder sb = new StringBuilder();
        sb.append(" update ").append(tableName);
        sb.append(" set ");
        String [] fields = new String [columnWithValue.keySet().size()];
        fields = columnWithValue.keySet().toArray(fields);
        int i=0;
        for (String field : fields) {
            String value = this.columnWithValue.get(field);
            sb.append(field).append(" = ").append(value);
            if (i!=(fields.length-1)) sb.append(DELIMITER); i++;
        }
        String [] conds = this.getStringConditions();
        for (String cond : conds) {
            sb.append(cond).append(" ");
        }
        return sb.toString();
    }
}
