package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name ="Product")
public class Product {

    @Id
    @Column(name="p_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pId;

    @Column(name="p_price")
    private int pPrice;

    @Column(name="p_name")
    private String pName;

    @Column(name="p_type")
    private String pType;

    @Column(name="p_description")
    private String pDescription;

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public int getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }
}
