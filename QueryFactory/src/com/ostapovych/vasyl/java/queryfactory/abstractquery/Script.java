package com.ostapovych.vasyl.java.queryfactory.abstractquery;

import com.ostapovych.vasyl.java.queryfactory.components.conditions.Condition;
import com.ostapovych.vasyl.java.queryfactory.components.pseudonyms.Pseudonyms;
import com.ostapovych.vasyl.java.queryfactory.interfaces.InterfaceScript;
import com.ostapovych.vasyl.java.queryfactory.components.joins.Join;

import java.util.ArrayList;
import java.util.List;


public abstract class Script implements InterfaceScript {
    protected List<Condition> conditions;
    protected List<Join> joins;
    protected String tableName;

    public Script(String tableName){
        this.joins = new ArrayList<Join>();
        this.conditions = new ArrayList<Condition>();
        this.tableName = tableName;
        
    }

    public String [] getStringConditions(){
        String [] res = new String [this.conditions.size()];
        int i=0;
        for (Condition c:this.conditions){
            String booleanOperation = c.getBooleanOperation().operation();
            String field = c.getField();
            String conditionOperation = c.getCondition().operation();
            String value  = c.getValue();
            StringBuffer sb = new StringBuffer();
            String fromTable = "";
            if (c.getFromTable() == null || c.getFromTable().isEmpty()){
                fromTable = this.tableName;
            } else{
                fromTable = c.getFromTable();
            }
            String pseudonym = Pseudonyms.generatePseudonym(fromTable);
            if (i==0){
                    sb.append(" Where ").append(pseudonym).append(".").append(field).append(" ");
                    sb.append(conditionOperation).append(" ");
                    sb.append(value);
            }
            else {
                sb.append(" ");
                sb.append(booleanOperation).append(" ");
                sb.append(pseudonym).append(".");
                sb.append(field).append(" ");
                sb.append(conditionOperation);
                sb.append(value);
            }
            res[i] = sb.toString();i++;
        }
        if (i==0){
            res = new String[1];
            StringBuffer sb = new StringBuffer();
            sb.append(" where 1=1");
            res[i] = sb.toString();
        }
        return res;
    }
    public void setConditions(Condition condition){
        this.conditions.add(condition);
    }
}
