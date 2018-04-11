package com.service.fortest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-11T12:09:27.719Z")

@RestSchema(schemaId = "fortest")
@RequestMapping(path = "/fortest", produces = MediaType.APPLICATION_JSON)
public class FortestImpl {

    @Autowired
    private FortestDelegate userFortestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userFortestDelegate.helloworld(name);
    }

}