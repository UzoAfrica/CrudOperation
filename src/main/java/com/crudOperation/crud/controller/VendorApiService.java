package com.crudOperation.crud.controller;

import com.crudOperation.crud.model.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class VendorApiService {

    Vendor vendor;
    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(String vendorId){
        return vendor;
//                new Vendor("C1", "Vendor 1",
//                "Address One","08067833");

        }

    @PostMapping
    public String createVendorDetails(@RequestBody Vendor vendor){
        this.vendor = vendor;
        return "Vendor Created Successfully";
    }
    @PutMapping
    public String updateVendorDetails(@RequestBody Vendor vendor){
        this.vendor = vendor;
        return "Vendor updated Successfully";
    }

}
