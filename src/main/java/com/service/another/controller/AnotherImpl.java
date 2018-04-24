package com.service.another.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-24T03:45:59.406Z")

@RestSchema(schemaId = "another")
@RequestMapping(path = "/another", produces = MediaType.APPLICATION_JSON)
public class AnotherImpl {

    @Autowired
    private AnotherDelegate userAnotherDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userAnotherDelegate.helloworld(name);
    }

}
