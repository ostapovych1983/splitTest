package com.ostapovych.vasyl.java.queryfactory.components.conditionoperaions;

public class Like implements ConditionOperation {
    @Override
    public String operation() {
        return LIKE;
    }
}
