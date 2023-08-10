package com.crudOperation.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Vendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneName;

    public Vendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneName) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneName = vendorPhoneName;
    }

    public Vendor() {
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneName() {
        return vendorPhoneName;
    }

    public void setVendorPhoneName(String vendorPhoneName) {
        this.vendorPhoneName = vendorPhoneName;
    }
}
