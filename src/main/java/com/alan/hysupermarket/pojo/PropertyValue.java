package com.alan.hysupermarket.pojo;

public class PropertyValue {
    private Long ID;

    private Long PID;

    private Long PTID;

    private String VALUE;

    /*非数据库字段*/
    private Property property;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getPID() {
        return PID;
    }

    public void setPID(Long PID) {
        this.PID = PID;
    }

    public Long getPTID() {
        return PTID;
    }

    public void setPTID(Long PTID) {
        this.PTID = PTID;
    }

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String VALUE) {
        this.VALUE = VALUE == null ? null : VALUE.trim();
    }
}