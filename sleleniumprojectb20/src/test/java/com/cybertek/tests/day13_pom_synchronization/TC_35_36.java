package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.LoginPageVytrack;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_35_36 {

        @Test(description = "forgot your password")

        public void forgot_your_password_button() {

            Driver.getDriver().get(ConfigurationReader.getProperty("vytrackUrl"));

            LoginPageVytrack loginPageVytrack = new LoginPageVytrack();

            //forgot your password

            loginPageVytrack.forgotYourPassword.click();

            String expectedTitle = "Forgot Password";
            String actualTitle = Driver.getDriver().getTitle();

            Assert.assertEquals(expectedTitle, actualTitle);

            String expectedURL = "https://qa3.vytrack.com/user/reset-request";
            String actualURL = Driver.getDriver().getCurrentUrl();

            Assert.assertEquals(expectedTitle, actualTitle);

        }
    }
