package com.alan.hysupermarket.pojo;

public class Product {
    private Long ID;

    private String NAME;

    private String SUBTITLE;

    private Double ORIGNALPRICE;

    private Double PROMOTEPRICE;

    private Long STOCK;

    private Long CID;

    private String CREATEDATE;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getSUBTITLE() {
        return SUBTITLE;
    }

    public void setSUBTITLE(String SUBTITLE) {
        this.SUBTITLE = SUBTITLE == null ? null : SUBTITLE.trim();
    }

    public Double getORIGNALPRICE() {
        return ORIGNALPRICE;
    }

    public void setORIGNALPRICE(Double ORIGNALPRICE) {
        this.ORIGNALPRICE = ORIGNALPRICE;
    }

    public Double getPROMOTEPRICE() {
        return PROMOTEPRICE;
    }

    public void setPROMOTEPRICE(Double PROMOTEPRICE) {
        this.PROMOTEPRICE = PROMOTEPRICE;
    }

    public Long getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(Long STOCK) {
        this.STOCK = STOCK;
    }

    public Long getCID() {
        return CID;
    }

    public void setCID(Long CID) {
        this.CID = CID;
    }

    public String getCREATEDATE() {
        return CREATEDATE;
    }

    public void setCREATEDATE(String CREATEDATE) {
        this.CREATEDATE = CREATEDATE == null ? null : CREATEDATE.trim();
    }
}