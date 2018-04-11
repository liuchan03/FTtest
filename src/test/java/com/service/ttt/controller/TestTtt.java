package com.service.ttt.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTtt {

        TttDelegate tttDelegate = new TttDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = tttDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}