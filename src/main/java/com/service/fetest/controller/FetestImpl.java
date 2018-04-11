package com.service.fetest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-11T12:54:11.950Z")

@RestSchema(schemaId = "fetest")
@RequestMapping(path = "/fetest", produces = MediaType.APPLICATION_JSON)
public class FetestImpl {

    @Autowired
    private FetestDelegate userFetestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userFetestDelegate.helloworld(name);
    }

}
