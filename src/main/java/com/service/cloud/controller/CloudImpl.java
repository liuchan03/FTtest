package com.service.cloud.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-02T09:07:16.801Z")

@RestSchema(schemaId = "cloud")
@RequestMapping(path = "/cloud", produces = MediaType.APPLICATION_JSON)
public class CloudImpl {

    @Autowired
    private CloudDelegate userCloudDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCloudDelegate.helloworld(name);
    }

}
