package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.LoginPageVytrack;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_30_31_32_Negative_Login {

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackUrl"));

    }
    @AfterMethod
    public void closeDriver(){
        Driver.closeDriver();
    }
    @Test(description = "entering incorrect password")

    public void negative_login_test1() {

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackUrl"));

        LoginPageVytrack loginPageVytrack = new LoginPageVytrack();

        //correct user name
        String username = ConfigurationReader.getProperty("vytrack_username");
        loginPageVytrack.usernameInput.sendKeys(username);

        //incorrect password
        String password = ConfigurationReader.getProperty("wrongdata");
        loginPageVytrack.passwordInput.sendKeys(password);

        //login button
        loginPageVytrack.loginButton.click();
        BrowserUtils.wait(2);
        Assert.assertTrue(loginPageVytrack.errorMessage.isDisplayed(), "Error message is not displayed. Verification Failed!");
    }

    @Test(description = "entering incorrect username")
    public void negative_login_test2() {

        LoginPageVytrack loginPageVytrack = new LoginPageVytrack();

        //incorrect user name
        String wrongUsername = ConfigurationReader.getProperty("wrongdata");
        loginPageVytrack.usernameInput.sendKeys(wrongUsername);

        //correct password
        String password = ConfigurationReader.getProperty("vytrack_password");
        loginPageVytrack.passwordInput.sendKeys(password);

        //login button
        loginPageVytrack.loginButton.click();
        BrowserUtils.wait(2);
        Assert.assertTrue(loginPageVytrack.errorMessage.isDisplayed(), "Error message is not displayed. Verification Failed!");
    }

    @Test(description = "entering correct credentials as Sales Manager")
    public void negative_login_test3() {

        LoginPageVytrack loginPageVytrack = new LoginPageVytrack();

        String managerUserName = ConfigurationReader.getProperty("vytrackstoremanager.username");
        loginPageVytrack.usernameInput.sendKeys(managerUserName);

        String managerPassword = ConfigurationReader.getProperty("vytrack_password");
        loginPageVytrack.passwordInput.sendKeys(managerPassword);
        //login button
        loginPageVytrack.loginButton.click();

        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.wait(5);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(description = "test4_Positive_login_driver")
    public void Positive_login_driver(){

        LoginPageVytrack loginPageVytrack = new LoginPageVytrack();

        String driverUserName = ConfigurationReader.getProperty("vytrack_username");
        loginPageVytrack.usernameInput.sendKeys(driverUserName);

        String driverPassword = ConfigurationReader.getProperty("vytrack_password");
        loginPageVytrack.passwordInput.sendKeys(driverPassword);

        loginPageVytrack.loginButton.click();

        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.wait(5);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(description = "vytrack_positive_login_storemanager")

    public void positive_login_storemanager(){

        LoginPageVytrack loginPageVytrack = new LoginPageVytrack();

        String storeManagerUsername = ConfigurationReader.getProperty("vytrackstoremanager.username");
        loginPageVytrack.usernameInput.sendKeys(storeManagerUsername);

        String storeManagerPassword = ConfigurationReader.getProperty("vytrack_password");
        loginPageVytrack.passwordInput.sendKeys(storeManagerPassword);

        loginPageVytrack.loginButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains("Dashboard"));

        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(description = "vytrack_forgot_password")
    public void forgot_password(){

        LoginPageVytrack loginPageVytrack = new LoginPageVytrack();
        loginPageVytrack.forgotYourPassword.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.titleContains("Forgot Password"));

        String expectedResult = "Forgot password";
        String actualResult = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedResult, actualResult);

        String getCurrentURl = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa3.vytrack.com/user/reset-request";

        Assert.assertEquals(getCurrentURl, expectedResult);
    }
    @Test (description = "vytrack forgot password verification")

    public void forgot_password_page_verification_message(){

        LoginPageVytrack loginPageVytrack = new LoginPageVytrack();
        loginPageVytrack.forgotYourPassword.click();

        String wrongdata = ConfigurationReader.getProperty("wrongdata");
        loginPageVytrack.usernameInput.sendKeys(wrongdata);

        loginPageVytrack.requestButton.click();

        Assert.assertTrue(loginPageVytrack.alertMessage.isDisplayed());

        String expectedAlertMessage = "There is no active user with username or email address \""+wrongdata+"\".";
        String actualAlertMessage = loginPageVytrack.alertMessage.getText();

        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);

    }
}
