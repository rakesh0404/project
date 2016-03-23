package com;

import com.factory.DriverHelper;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;


public class Hooks{
    DriverHelper helper=new DriverHelper();

    @Before
    public void setUp()throws IOException{
        helper.openBrowser();
    }
    @After
    public void tearDown(){
        helper.closeBroswer();
    }

}
