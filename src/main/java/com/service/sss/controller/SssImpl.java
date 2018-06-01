package com.service.sss.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-01T11:42:39.436Z")

@RestSchema(schemaId = "sss")
@RequestMapping(path = "/sss", produces = MediaType.APPLICATION_JSON)
public class SssImpl {

    @Autowired
    private SssDelegate userSssDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userSssDelegate.helloworld(name);
    }

}
