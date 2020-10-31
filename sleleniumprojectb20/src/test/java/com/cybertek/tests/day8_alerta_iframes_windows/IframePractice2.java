package com.cybertek.tests.day8_alerta_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice2 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }
    @Test
    public void p4_iframe_practice(){
        WebElement iframe = driver.findElement(By.xpath("mce_0_ifr"));
        driver.switchTo().frame(iframe);

        WebElement yourContentGoesHere = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHere.isDisplayed(), "Text isn't displayed.Verification failed!");

        driver.switchTo().defaultContent();

        WebElement headerText = driver.findElement(By.xpath("h3"));

        Assert.assertTrue(headerText.isDisplayed(), "Header text isn't displayed. Verification failed!");
    }
}
