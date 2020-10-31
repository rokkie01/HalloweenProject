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

public class P8_SimpleDropdownSelectingDate {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void selecting_date() {

        Select selectingYear = new Select(driver.findElement(By.id("year")));
        selectingYear.selectByVisibleText("1921");

        Select selectingMonth = new Select(driver.findElement(By.id("month")));
        selectingMonth.selectByValue("11");

        Select selectingDate = new Select(driver.findElement(By.id("day")));
        selectingDate.selectByIndex(0);

        String expectedResultYear = "1921";
        String actualResultYear = selectingYear.getFirstSelectedOption().getText();

        String expectedResultMonth = "December";
        String actualResultMonth = selectingMonth.getFirstSelectedOption().getText();

        String expectedResultDate = "1";
        String actualResultDate = selectingDate.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedResultYear, actualResultYear );
        Assert.assertEquals(expectedResultMonth, actualResultMonth);
        Assert.assertEquals(expectedResultDate, actualResultDate);
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
