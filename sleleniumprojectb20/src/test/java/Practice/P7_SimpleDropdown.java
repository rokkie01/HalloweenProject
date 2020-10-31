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

public class P7_SimpleDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void State_selection_verification() throws InterruptedException {

        Select stateSelection = new Select(driver.findElement(By.id("state")));

        stateSelection.selectByVisibleText("Illinois");
        Thread.sleep(1000);
        stateSelection.selectByVisibleText("Virginia");
        Thread.sleep(1000);
        stateSelection.selectByValue("CA");

        String actualResult = stateSelection.getFirstSelectedOption().getText();
        String expectedResult = "California";

        Assert.assertEquals(actualResult, expectedResult);
    }

    public void select_state_button_verification() {

        Select selectStateDropdown = new Select(driver.findElement(By.id("state")));
        String expectedResultForState = "Select a State";
        String actualResultForState = selectStateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedResultForState, actualResultForState, "Titles are not matching!");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
