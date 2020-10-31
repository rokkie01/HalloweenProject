package com.cybertek.tests.day10_testbase_properties_driveUtil;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearPractice_10 {

    /*1.Open browser and login to SmartBear
        2.Click to edit button from the right for “Steve Johns”
        3.Change name to “Michael Jordan”
        4.Click Update
        5.Assert “Michael Jordan” is in the list
         */
        WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
            SmartBearUtilities.loginToSmartBear(driver);
        }
        @Test

        public void P10_Edit_ChangeName() {
            // 2.Click to edit button from the right for “Steve Johns”
            WebElement editSteve = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[4]/td[13]"));
            editSteve.click();
            WebElement replaceJordan = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
            //  replaceJordan.click();
            replaceJordan.clear();
            replaceJordan.sendKeys("Michael Jordan");
            WebElement updateBtn = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']"));
            updateBtn.click();
            String actualResult = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[4]/td[2]")).getText();
            String expectedResult = "Michael Jordan";
            Assert.assertEquals(actualResult, expectedResult, "Invalid !!!");
        }
    }
