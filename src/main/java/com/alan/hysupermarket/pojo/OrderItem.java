package com.alan.hysupermarket.pojo;

public class OrderItem {
    private Long ID;

    private Long PID;

    private Long OID;

    private Long u_ID;

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

    public Long getU_ID() {
        return u_ID;
    }

    public void setU_ID(Long u_ID) {
        this.u_ID = u_ID;
    }

    public Long getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(Long QUANTITY) {
        this.QUANTITY = QUANTITY;
    }
}