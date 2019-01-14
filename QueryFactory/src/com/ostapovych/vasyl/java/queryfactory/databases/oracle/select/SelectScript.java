package com.ostapovych.vasyl.java.queryfactory.databases.oracle.select;


import com.ostapovych.vasyl.java.queryfactory.abstractquery.AbstractSelectScript;
import com.ostapovych.vasyl.java.queryfactory.components.joins.Join;
import com.ostapovych.vasyl.java.queryfactory.components.pseudonyms.Pseudonyms;

public class SelectScript extends AbstractSelectScript
{
    public SelectScript(String tableName, String[] fields) {
        super(tableName.toUpperCase(), fields);
    }

    @Override
    protected String _getGeneratedScript() {
        StringBuffer sb = new StringBuffer();
        sb.append("select ");
        if (this.limit != null)
        	sb.append(" ").append(limit.getLimit()).append(" ");
       for (int i=0;i<fields.length;i++){
           String fld = Pseudonyms.generatePseudonym(this.tableName)+"."+fields[i];
           if (i== fields.length-1) sb.append(fld);
           else sb.append(fld+",");
       }
       sb.append(" from "+tableName);
       sb.append(" ").append(Pseudonyms.generatePseudonym(this.tableName));
       if (joins != null) sb.append(createJoins());
       String [] stringCondition = this.getStringConditions();
       for (String s:stringCondition)
        sb.append(s);
       return sb.toString();
    }

    private String createJoins() {
        StringBuffer sb = new StringBuffer();
        for (Join j:joins){
            sb.append(j.generateJoin());
        }
        return sb.toString();
    }

}
