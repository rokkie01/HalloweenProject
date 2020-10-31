package com.cybertek.tests.day5_SeleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Introduction {

    public void setUpClass(){
        System.out.println("Before method is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running...");
    }

    @Test
    public void test1(){
        System.out.println("Test1 is running...");
    }

    @Test
    public void test2(){
        System.out.println("Test2 is running...");
    }
    @Test
    public void test3(){
        String str1 = "TestNG";
        String str2 = "TestNG";
        String str3 = "asdfg";

        Assert.assertTrue(str1.equals(str2));

        Assert.assertTrue(str1.equals(str3));

        System.out.println("Just checking if this line will run???");
        Assert.assertEquals(str1, str2, "Failure message just in case str1 isn't equals to str2");
    }
}
