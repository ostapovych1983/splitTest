package com.ostapovych.vasyl.java.queryfactory.databases.mssql.delete;

import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractDeleteScript;

public class DeleteScript extends AbstractDeleteScript {

    public DeleteScript(String tableName) {
        super(tableName);
    }

    protected String _getGeneratedScript(){
        StringBuilder sb = new StringBuilder();
        sb.append("delete from ").append(this.tableName);
        sb.append(" where 1=1 ");

        String [] conds = this.getStringConditions();
        for (String cond : conds) {
            sb.append(cond);
        }
        return sb.toString();
    }


}
