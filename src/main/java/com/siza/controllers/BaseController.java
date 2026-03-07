package com.siza.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/base")
public class BaseController {

    @GetMapping
    public String base(){
        return "Server is up";
    }
}
