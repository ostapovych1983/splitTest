package com.ostapovych.vasyl.java.queryfactory.components.joins;

import com.ostapovych.vasyl.java.queryfactory.components.booleanoperation.BooleanOperation;
import com.ostapovych.vasyl.java.queryfactory.components.conditionoperaions.ConditionOperation;
import com.ostapovych.vasyl.java.queryfactory.components.pseudonyms.Pseudonyms;

import java.util.ArrayList;
import java.util.List;

public class Join {
    public static final String JOIN_TYPE = "JOIN";
    public static final String LEFT_JOIN_TYPE = "LEFT JOIN";
    public static final String RIGHT_JOIN_TYPE = "RIGHT JOIN";
    public static final String INNER_JOIN_TYPE = "INNER JOIN";
    public static final String FULL_JOIN_TYPE = "FULL JOIN";
    public static final String OUTER_JOIN_TYPE = "OUTER JOIN";
    private String tableSource;
    private String tableDestination;
    private List<JoinCondition> fieldsJoin = new ArrayList<JoinCondition>();
    private String joinType;

    public Join(String tableSource, String tableDestination,String joinType) {
        this.tableDestination = tableDestination.toUpperCase();
        this.joinType = joinType.toUpperCase();
        this.tableSource = tableSource.toUpperCase();
    }
    public void addFieldCondition(BooleanOperation booleanOperation,String tableSource,String fieldTable1,ConditionOperation conditionOperation,String tableDestination,String fieldTable2){
        JoinCondition jc = new JoinCondition(booleanOperation,tableSource,fieldTable1, conditionOperation,tableDestination,fieldTable2);
        this.fieldsJoin.add(jc);
    }
    public String generateJoin(){
        StringBuffer sb = new StringBuffer();
        sb.append(" ");
        sb.append(this.joinType).append(" ");
        sb.append(this.tableDestination).append(" ");
        sb.append(Pseudonyms.generatePseudonym(this.tableDestination));
        sb.append(" ON ");
        sb.append(" 1=1 ");
        for (JoinCondition jc: fieldsJoin){
            sb.append(jc.generateCondition());
            sb.append(" ");
        }
        return sb.toString();
    }
}
