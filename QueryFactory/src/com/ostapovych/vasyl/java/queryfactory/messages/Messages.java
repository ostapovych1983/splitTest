package com.ostapovych.vasyl.java.queryfactory.messages;

public class Messages {
    private final String TABLE_NAME_EMPTY_ERROR =  "Table Name cannot be null or empty";
    private final String TABLE_VALUES_NULL_ERROR = "Values cannot be null.";
    private final String VALUES_EMPTY_ERROR = "Values cannot be empty";
    private final String CONDITION_FIELD_NULL_ERROR = "Field cannot be null";
    private final String CONDITION_FIELD_EMPTY_ERROR = "Field cannot by empty";
    private final String CONDITION_VALUE_NULL_ERROR = "Value cannot be null";
    private final String CONDITION_VALUE_EMPTY_ERROR = "Value cannot be empty";
    private final String BOOLEAN_OPERATION_NULL_ERROR = "Boolean operation cannot be null";
    private final String BOOLEAN_OPERATION_EMPTY_ERROR = "Boolean operation cannot be empty";
    private final String UNSUPPORTED_BOOLEAN_OPERATION = "Unsupported boolean operation. Please check Operation";
    private final String CONDITION_OPERATION_NULL_ERROR = "Condition operation cannot be null";
    private final String CONDITION_OPERATION_EMPTY_ERROR = "Condition operation cannot be empty";
    private final String UNSUPPORTED_CONDITION_OPERATION_ERROR = "Unsupported condition operation. Please check condition operation";
    private final String LIST_CONDITION_NULL_ERROR = "List condition cannot be null";
    private final String LIST_CONDITION_EMPTY_ERROR = "List condition cannot be empty!!!";
    private final String MAP_COLUMN_VALUES_NULL_ERROR = "Map column cannot be null";
    private final String MAP_COLUMN_VALUES_EMPTY_ERROR = "Map column cannot be empty";
    private final String VALIDATOR_NOT_SUPPORTED_ERROR = "This validator not supported";
    private final String FIELDS_NULL_ERROR = "Fields cannot be null";
    private final String FIELDS_EMPTY_ERROR = "For select script need not less one field";

    public String getTABLE_NAME_EMPTY_ERROR() {
        return TABLE_NAME_EMPTY_ERROR;
    }

    public String getTABLE_VALUES_NULL_ERROR() {
        return TABLE_VALUES_NULL_ERROR;
    }

    public String getVALUES_EMPTY_ERROR() {
        return VALUES_EMPTY_ERROR;
    }

    public String getCONDITION_FIELD_NULL_ERROR() {
        return CONDITION_FIELD_NULL_ERROR;
    }

    public String getCONDITION_FIELD_EMPTY_ERROR() {
        return CONDITION_FIELD_EMPTY_ERROR;
    }

    public String getCONDITION_VALUE_NULL_ERROR() {
        return CONDITION_VALUE_NULL_ERROR;
    }

    public String getCONDITION_VALUE_EMPTY_ERROR() {
        return CONDITION_VALUE_EMPTY_ERROR;
    }

    public String getBOOLEAN_OPERATION_NULL_ERROR() {
        return BOOLEAN_OPERATION_NULL_ERROR;
    }

    public String getBOOLEAN_OPERATION_EMPTY_ERROR() {
        return BOOLEAN_OPERATION_EMPTY_ERROR;
    }

    public String getUNSUPPORTED_BOOLEAN_OPERATION() {
        return UNSUPPORTED_BOOLEAN_OPERATION;
    }

    public String getCONDITION_OPERATION_NULL_ERROR() {
        return CONDITION_OPERATION_NULL_ERROR;
    }

    public String getCONDITION_OPERATION_EMPTY_ERROR() {
        return CONDITION_OPERATION_EMPTY_ERROR;
    }

    public String getUNSUPPORTED_CONDITION_OPERATION_ERROR() {
        return UNSUPPORTED_CONDITION_OPERATION_ERROR;
    }

    public String getLIST_CONDITION_NULL_ERROR() {
        return LIST_CONDITION_NULL_ERROR;
    }

    public String getLIST_CONDITION_EMPTY_ERROR() {
        return LIST_CONDITION_EMPTY_ERROR;
    }

    public String getMAP_COLUMN_VALUES_NULL_ERROR() {
        return MAP_COLUMN_VALUES_NULL_ERROR;
    }

    public String getMAP_COLUMN_VALUES_EMPTY_ERROR() {
        return MAP_COLUMN_VALUES_EMPTY_ERROR;
    }

    public String getVALIDATOR_NOT_SUPPORTED_ERROR() {
        return VALIDATOR_NOT_SUPPORTED_ERROR;
    }

    public String getFIELDS_NULL_ERROR() {
        return FIELDS_NULL_ERROR;
    }

    public String getFIELDS_EMPTY_ERROR() {
        return FIELDS_EMPTY_ERROR;
    }
}
