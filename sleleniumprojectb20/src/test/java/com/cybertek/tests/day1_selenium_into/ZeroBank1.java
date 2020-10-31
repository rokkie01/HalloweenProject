package com.cybertek.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedResult = "Zero - Log in";
        String actualResult = driver.getTitle();

//        System.out.println(actualResult);
//        System.out.println(expectedResult);

        if (actualResult.equals(expectedResult)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification Failed");

        }
        }
}
