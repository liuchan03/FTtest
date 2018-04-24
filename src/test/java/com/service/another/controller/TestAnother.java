package com.service.another.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAnother {

        AnotherDelegate anotherDelegate = new AnotherDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = anotherDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}