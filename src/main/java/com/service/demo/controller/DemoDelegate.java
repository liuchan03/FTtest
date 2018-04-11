package com.service.demo.controller;

import org.springframework.stereotype.Component;


@Component
public class DemoDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
