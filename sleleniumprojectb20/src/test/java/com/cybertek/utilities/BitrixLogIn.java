package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BitrixLogIn {
    public static void logIntoBitrix(WebDriver driver){

        driver.get("https://login2.nextbasecrm.com/");

        WebElement usernameInput = driver.findElement(By.name("USER_LOGIN"));
        usernameInput.sendKeys("hr22@cybertekschool.com");

        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

    }
}
