package com.ostapovych.vasyl.java.queryfactory.interfaces;

import com.ostapovych.vasyl.java.queryfactory.errors.ValidatorError;

/**
 *  This interface represent Script. All script, such as Update
 *  Insert,Delete - it is Scripts. Uses this interface in this case,
 *  when you need get just Script and does not matter what kind is this.
 */
public interface InterfaceScript {
    /*
        This method uses to get a String scripts. This script
        can be taken a DataBase system and execute. This method
        give a right scrip, full compatibility with type and version
        DataBase Management
     */
    public String getGeneratedScript()throws ValidatorError;
}
