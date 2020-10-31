package com.cybertek.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBPractice2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com/login");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Irene@gmail.com");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Rokkie");
        driver.findElement(By.id("loginbutton")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Test has Passed");
        } else {
            System.out.println("Test has Failed");

        }
    }
}
