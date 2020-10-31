package com.cybertek.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBPractice4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        String actualResult = driver.findElement(By.linkText("Create a Page")).getAttribute("href");
        String expectedResult = "registration_form";

        if(actualResult.contains(expectedResult)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }
}
