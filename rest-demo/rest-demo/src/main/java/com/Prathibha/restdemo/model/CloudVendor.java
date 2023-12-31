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

}
