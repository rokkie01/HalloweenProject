package com.cybertek.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

        String expectedUrl = "cybertekschool";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedUrl)){
            System.out.println("The test has passed");
        }else{
            System.out.println("The test has failed");
        }
        if(driver.getTitle().contains("Practice")){
            System.out.println("The test has passed");
        }else {
            System.out.println("The test has failed");
        }
    }
}
