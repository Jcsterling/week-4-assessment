package com.qa.helloworld;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testing {

    private Main m;

    @Before
    public void newObject() {
        m = new Main();
    }


    @Test

    public void doubleCharTest(){

        assertEquals("aabbcc", m.doubleChar("abc") );
    }








}
