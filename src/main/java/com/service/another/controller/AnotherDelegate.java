package com.service.another.controller;

import org.springframework.stereotype.Component;


@Component
public class AnotherDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
