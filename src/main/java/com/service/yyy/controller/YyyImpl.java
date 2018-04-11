package com.service.yyy.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-11T12:31:16.172Z")

@RestSchema(schemaId = "yyy")
@RequestMapping(path = "/yyy", produces = MediaType.APPLICATION_JSON)
public class YyyImpl {

    @Autowired
    private YyyDelegate userYyyDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userYyyDelegate.helloworld(name);
    }

}
