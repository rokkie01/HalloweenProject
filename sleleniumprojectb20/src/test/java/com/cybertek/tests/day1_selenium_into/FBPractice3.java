package com.cybertek.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBPractice3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        String expectedTitle = "Connect with friends and the world around you on Facebook.";
        String actualTitle = driver.findElement(By.tagName("h2")).getText();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test has Passed");
        } else {
            System.out.println("Test has Failed");
        }
    }
}
