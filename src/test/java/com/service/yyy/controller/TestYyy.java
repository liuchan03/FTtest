package com.service.yyy.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestYyy {

        YyyDelegate yyyDelegate = new YyyDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = yyyDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}