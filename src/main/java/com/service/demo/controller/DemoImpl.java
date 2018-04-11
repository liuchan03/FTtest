package com.service.demo.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-11T13:35:10.973Z")

@RestSchema(schemaId = "demo")
@RequestMapping(path = "/demo", produces = MediaType.APPLICATION_JSON)
public class DemoImpl {

    @Autowired
    private DemoDelegate userDemoDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDemoDelegate.helloworld(name);
    }

}
