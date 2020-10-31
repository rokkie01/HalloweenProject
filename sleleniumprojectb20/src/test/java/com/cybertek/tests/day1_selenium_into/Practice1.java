package com.cybertek.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("irene.varol@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@jsname='LgbsSe']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("1234");

//        driver.findElement(By.className("xkfVF")).click();
//        Thread.sleep(2000);
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "gmail";
//        driver.close();
//        if(actualTitle.equalsIgnoreCase(expectedTitle)){
//            System.out.println( "Test has Passed");
//        }else{
//            System.out.println("Test has Failed");


    }
}
