package com.service.forit.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-11T11:50:46.061Z")

@RestSchema(schemaId = "forit")
@RequestMapping(path = "/forit", produces = MediaType.APPLICATION_JSON)
public class ForitImpl {

    @Autowired
    private ForitDelegate userForitDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userForitDelegate.helloworld(name);
    }

}
