package com.ostapovych.vasyl.java.queryfactory.components.conditionoperaions;

public interface ConditionOperation {
    public static final String EQUALS = "=";
    public static final String NOT_EQUALS = "<>";
    public static final String LESS = "<";
    public static final String MORE =">" ;
    public static final String LESS_EQUALS="<=";
    public static final String MORE_EQUALS= ">=";
    public static final String LIKE = "LIKE";
    public static final String NOT_LIKE = "NOT LIKE";
    public String operation();
}
