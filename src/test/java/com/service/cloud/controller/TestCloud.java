package com.service.cloud.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCloud {

        CloudDelegate cloudDelegate = new CloudDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cloudDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}