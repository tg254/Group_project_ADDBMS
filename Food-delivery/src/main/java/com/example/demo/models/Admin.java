package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private long adminId;

    @Column(name = "admin_name")
    private String adminName;

    @Column(name = "admin_email")
    private String adminEmail;

    @Column(name = "admin_password")
    private String adminPassword;

    @Column(name = "admin_img_location")
    private String adminImgLocation;

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminImgLocation() {
        return adminImgLocation;
    }

    public void setAdminImgLocation(String adminImgLocation) {
        this.adminImgLocation = adminImgLocation;
    }
}
