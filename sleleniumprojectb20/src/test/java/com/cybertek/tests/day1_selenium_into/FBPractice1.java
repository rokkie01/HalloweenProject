package com.cybertek.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBPractice1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        driver.findElement(By.linkText("Log In")).click();

        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification Failed");


        }
    }
}
