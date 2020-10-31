package com.cybertek.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);
        String expectedInsideTitle = "Zero - Account Summary";
        String actualInsideTitle = driver.getTitle();

        if (actualInsideTitle.equals(expectedInsideTitle)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification Failed");
        }
        }
}
