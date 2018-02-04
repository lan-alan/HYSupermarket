package com.alan.hysupermarket.pojo;

import java.util.Date;

public class Review {
    private Long ID;

    private String CONTENT;

    private Long u_ID;

    private Long PID;

    private Date CREATEDATE;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }

    public Long getU_ID() {
        return u_ID;
    }

    public void setU_ID(Long u_ID) {
        this.u_ID = u_ID;
    }

    public Long getPID() {
        return PID;
    }

    public void setPID(Long PID) {
        this.PID = PID;
    }

    public Date getCREATEDATE() {
        return CREATEDATE;
    }

    public void setCREATEDATE(Date CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }
}