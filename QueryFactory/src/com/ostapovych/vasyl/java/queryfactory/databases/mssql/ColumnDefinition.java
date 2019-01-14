package com.ostapovych.vasyl.java.queryfactory.databases.mssql;

public class ColumnDefinition {
    private String columnName;
    private String columnType;
    private boolean isNull;
    private Integer size;

    public ColumnDefinition(){
        this.columnName = "";
        this.columnType = "";
        this.isNull = true;
        this.size = 10;

    }
    public ColumnDefinition(String columnName, String columnType, boolean aNull, Integer size) {
        this.columnName = columnName;
        this.columnType = columnType;
        isNull = aNull;
        this.size = size;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public boolean isNull() {
        return isNull;
    }

    public void setNull(boolean aNull) {
        isNull = aNull;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
