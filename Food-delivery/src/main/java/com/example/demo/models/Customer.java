package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_id")
    private Long userId;

    @Column(name = "cus_u_name")
    private String cusUserName;

    @Column(name = "cus_f_name")
    private String cusFirstName;

    @Column(name = "cus_l_name")
    private String cusLastName;

    @Column(name = "cus_password")
    private String cusPassword;

    @Column(name = "cus_email")
    private String cusEmail;

    @Column(name = "cus_address")
    private String cusAddress;

    @Column(name = "cus_img_location")
    private String cusImgLocation;

    public String getCusImgLocation() {
        return cusImgLocation;
    }

    public void setCusImgLocation(String cusImgLocation) {
        this.cusImgLocation = cusImgLocation;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCusUserName() {
        return cusUserName;
    }

    public void setCusUserName(String cusUserName) {
        this.cusUserName = cusUserName;
    }

    public String getCusFirstName() {
        return cusFirstName;
    }

    public void setCusFirstName(String cusFirstName) {
        this.cusFirstName = cusFirstName;
    }

    public String getCusLastName() {
        return cusLastName;
    }

    public void setCusLastName(String cusLastName) {
        this.cusLastName = cusLastName;
    }

    public String getCusPassword() {
        return cusPassword;
    }

    public void setCusPassword(String cusPassword) {
        this.cusPassword = cusPassword;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }
}
