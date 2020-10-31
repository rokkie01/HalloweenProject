package com.cybertek.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        String actualResult = driver.findElement(By.linkText("Zero Bank")).getAttribute("href");
        String expectedResult = "index.html";

        if (actualResult.contains(expectedResult)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification Failed");
        }


        }
}
