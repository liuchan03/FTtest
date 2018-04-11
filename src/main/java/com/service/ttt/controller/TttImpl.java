package com.service.ttt.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-11T13:33:06.026Z")

@RestSchema(schemaId = "ttt")
@RequestMapping(path = "/ttt", produces = MediaType.APPLICATION_JSON)
public class TttImpl {

    @Autowired
    private TttDelegate userTttDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTttDelegate.helloworld(name);
    }

}
