package com.service.fetest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestFetest {

        FetestDelegate fetestDelegate = new FetestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = fetestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}