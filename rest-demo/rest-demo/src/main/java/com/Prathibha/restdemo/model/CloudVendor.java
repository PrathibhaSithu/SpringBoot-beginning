package com.Prathibha.restdemo.model;

public class CloudVendor {
    private String venderId;
    private String venderName;
    private String venderAddress;
    private String venderPhoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(String venderId, String venderName, String venderAddress, String venderPhoneNumber) {
        this.venderId = venderId;
        this.venderName = venderName;
        this.venderAddress = venderAddress;
        this.venderPhoneNumber = venderPhoneNumber;
    }
    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }

    public String getVenderAddress() {
        return venderAddress;
    }

    public void setVenderAddress(String venderAddress) {
        this.venderAddress = venderAddress;
    }

    public String getVenderPhoneNumber() {
        return venderPhoneNumber;
    }

    public void setVenderPhoneNumber(String venderPhoneNumber) {
        this.venderPhoneNumber = venderPhoneNumber;
    }

}
