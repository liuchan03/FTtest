package com.service.demo.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDemo {

        DemoDelegate demoDelegate = new DemoDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = demoDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}