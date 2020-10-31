package Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P6_SimpleDropdown {

        WebDriver driver;

     @BeforeMethod
        public void setUpMethod(){
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            // 2.Go to http://practice.cybertekschool.com/dropdown
            driver.get("http://practice.cybertekschool.com/dropdown");

        }
        @Test (priority = 1)
        public void simple_dropdown_verification() {
            // 3.Verify “Simple dropdown” default selected value
            // is correctExpected: “Please select an option”
            Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));

            String exprectedResult = "Please select an option";
            String actualResult = simpleDropdown.getFirstSelectedOption().getText();

            Assert.assertEquals(exprectedResult, actualResult, "failure message, if the text doesn't match");

            //simpleDropdown.selectByIndex(2);
            //simpleDropdown.selectByVisibleText("Option 2");
            //simpleDropdown.selectByValue("2");


        }
        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”
    //  Assert.assertEquals(actualTitle, expectedTitle, "Titles are not matching!");
        @Test
        public void select_state_button_verification() {

            Select selectStateDropdown = new Select(driver.findElement(By.id("state")));
            String expectedResultForState = "Select a State";
            String actualResultForState = selectStateDropdown.getFirstSelectedOption().getText();

            Assert.assertEquals(expectedResultForState, actualResultForState,"Titles are not matching!" );
        }
            @AfterMethod
            public void tearDownMethod() throws InterruptedException {
                Thread.sleep(3000);
                driver.close();
            }
    }
