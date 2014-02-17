package com.ostapovych.vasyl.java.queryfactory.components.conditionoperaions;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 11/9/13
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class NotLike implements  ConditionOperation{
    @Override
    public String operation() {
        return NOT_LIKE;
    }
}
