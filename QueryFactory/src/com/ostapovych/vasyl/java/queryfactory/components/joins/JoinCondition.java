package com.ostapovych.vasyl.java.queryfactory.components.joins;

import com.ostapovych.vasyl.java.queryfactory.components.booleanoperation.BooleanOperation;
import com.ostapovych.vasyl.java.queryfactory.components.conditionoperaions.ConditionOperation;
import com.ostapovych.vasyl.java.queryfactory.components.pseudonyms.Pseudonyms;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 11/5/13
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class JoinCondition {
    private BooleanOperation booleanOperation;
    private String sourceTableName;
    private String tableField1;
    private ConditionOperation conditionOperation;
    private String destinationTableName;
    private String tableField2;

    public JoinCondition(BooleanOperation booleanOperation, String sourceTableName, String tableField1, ConditionOperation conditionOperation, String destinationTableName, String tableField2) {
        this.booleanOperation = booleanOperation;
        this.sourceTableName = sourceTableName;
        this.tableField1 = tableField1;
        this.conditionOperation = conditionOperation;
        this.destinationTableName = destinationTableName;
        this.tableField2 = tableField2;
    }

    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public String getTableField1() {
        return tableField1;
    }

    public void setTableField1(String tableField1) {
        this.tableField1 = tableField1;
    }

    public String getDestinationTableName() {
        return destinationTableName;
    }

    public void setDestinationTableName(String destinationTableName) {
        this.destinationTableName = destinationTableName;
    }

    public String getTableField2() {
        return tableField2;
    }

    public void setTableField2(String tableField2) {
        this.tableField2 = tableField2;
    }
    public String generateCondition(){
        StringBuffer sb = new StringBuffer();
        sb.append(" ");
        sb.append(this.booleanOperation.operation());
        sb.append(" ");
        sb.append(Pseudonyms.generatePseudonym(this.sourceTableName)).append(".");
        sb.append(this.tableField1);
        sb.append(" ");
        sb.append(this.conditionOperation.operation());
        sb.append(" ");
        sb.append(Pseudonyms.generatePseudonym(this.destinationTableName)).append(".");
        sb.append(this.tableField2);
        sb.append(" ");
        return sb.toString();
    }

    public BooleanOperation getBooleanOperation() {
        return booleanOperation;
    }

    public void setBooleanOperation(BooleanOperation booleanOperation) {
        this.booleanOperation = booleanOperation;
    }

    public ConditionOperation getConditionOperation() {
        return conditionOperation;
    }

    public void setConditionOperation(ConditionOperation conditionOperation) {
        this.conditionOperation = conditionOperation;
    }
}
