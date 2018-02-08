package com.alan.hysupermarket.pojo;

import java.util.Date;
import java.util.List;

public class Order {
    private Long ID;

    private String ORDERCODE;

    private String ADDRESS;

    private String POST;

    private String RECEIVER;

    private String MOBILE;

    private String USERMESSAGE;

    private Date CREATEDATE;

    private Date PAYDATE;

    private Date DELIVERYDATE;

    private Date CONFIRMDATE;

    private Long u_ID;

    private String STATUS;

    /*如下是非数据库字段*/
    private List<OrderItem> orderItems;

    private User user;

    private float total;

    private int totalNumber;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
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

    public String getORDERCODE() {
        return ORDERCODE;
    }

    public void setORDERCODE(String ORDERCODE) {
        this.ORDERCODE = ORDERCODE == null ? null : ORDERCODE.trim();
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

    public Long getU_ID() {
        return u_ID;
    }

    public void setU_ID(Long u_ID) {
        this.u_ID = u_ID;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }
}