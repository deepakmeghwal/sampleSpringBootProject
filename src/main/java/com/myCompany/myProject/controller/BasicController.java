package com.myCompany.myProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/serviceStatus")
    public String getServiceStatus(){
        return "Service is up and running";
    }

}
