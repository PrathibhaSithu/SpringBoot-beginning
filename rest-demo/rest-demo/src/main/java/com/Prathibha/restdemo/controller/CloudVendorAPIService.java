package com.Prathibha.restdemo.controller;

import com.Prathibha.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    //get Request
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return new CloudVendor("C1", "Name 1", "Address one", "xxxxxxxxxx");

    }
}
