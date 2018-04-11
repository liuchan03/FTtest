package com.service.forit.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestForit {

        ForitDelegate foritDelegate = new ForitDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = foritDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}