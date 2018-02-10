package com.alan.hysupermarket.pojo;

public class OrdersItem {
    private Long ID;

    private Long PID;

    private Long OID;

    private Long UUID;

    private Long QUANTITY;

    /*非数据库字段*/
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }

    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
    }

    public Long getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(Long QUANTITY) {
        this.QUANTITY = QUANTITY;
    }
}