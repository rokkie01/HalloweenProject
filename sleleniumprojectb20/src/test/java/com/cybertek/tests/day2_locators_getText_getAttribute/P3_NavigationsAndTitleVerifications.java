package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerifications {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle = "Gmail";
        String actualaTitle = driver.getTitle();

        if(actualaTitle.contains(expectedTitle)){
            System.out.println("Title verification Passed");
        }else{
            System.out.println("Title verification Failed");

            driver.navigate().back();

            String expectedGooglrTitle = "Gmail";
            String actualGoogleTitle = driver.getTitle();

            if(actualaTitle.equals(expectedTitle)){
                System.out.println("Gmail title verification Passed");
            }else{
                System.out.println("Gmail title verification Failed");
            }
        }
    }
}
