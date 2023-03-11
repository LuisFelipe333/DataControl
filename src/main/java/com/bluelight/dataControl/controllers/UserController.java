package com.bluelight.dataControl.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "try")
    public String back(){
        return "Try";
    }
}
