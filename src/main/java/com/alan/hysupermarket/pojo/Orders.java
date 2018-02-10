package com.alan.hysupermarket.pojo;

import java.util.Date;
import java.util.List;

public class Orders {
    private Long ID;

    private String ORDERSCODE;

    private String ADDRESS;

    private String POST;

    private String RECEIVER;

    private String MOBILE;

    private String USERMESSAGE;

    private Date CREATEDATE;

    private Date PAYDATE;

    private Date DELIVERYDATE;

    private Date CONFIRMDATE;

    private Long UUID;

    private String STATUS;

    /*如下是非数据库字段*/
    private List<OrdersItem> orderItems;

    private Users user;

    private float total;

    private int totalNumber;

    public List<OrdersItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrdersItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getORDERSCODE() {
        return ORDERSCODE;
    }

    public void setORDERSCODE(String ORDERSCODE) {
        this.ORDERSCODE = ORDERSCODE == null ? null : ORDERSCODE.trim();
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS == null ? null : ADDRESS.trim();
    }

    public String getPOST() {
        return POST;
    }

    public void setPOST(String POST) {
        this.POST = POST == null ? null : POST.trim();
    }

    public String getRECEIVER() {
        return RECEIVER;
    }

    public void setRECEIVER(String RECEIVER) {
        this.RECEIVER = RECEIVER == null ? null : RECEIVER.trim();
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE == null ? null : MOBILE.trim();
    }

    public String getUSERMESSAGE() {
        return USERMESSAGE;
    }

    public void setUSERMESSAGE(String USERMESSAGE) {
        this.USERMESSAGE = USERMESSAGE == null ? null : USERMESSAGE.trim();
    }

    public Date getCREATEDATE() {
        return CREATEDATE;
    }

    public void setCREATEDATE(Date CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }

    public Date getPAYDATE() {
        return PAYDATE;
    }

    public void setPAYDATE(Date PAYDATE) {
        this.PAYDATE = PAYDATE;
    }

    public Date getDELIVERYDATE() {
        return DELIVERYDATE;
    }

    public void setDELIVERYDATE(Date DELIVERYDATE) {
        this.DELIVERYDATE = DELIVERYDATE;
    }

    public Date getCONFIRMDATE() {
        return CONFIRMDATE;
    }

    public void setCONFIRMDATE(Date CONFIRMDATE) {
        this.CONFIRMDATE = CONFIRMDATE;
    }

    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }
}