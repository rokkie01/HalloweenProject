package Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P_9_MultipleSelectDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void multiple_Select_Dropdown() {

        Select multipleSelectDropdown = new Select(driver.findElement(By.xpath("//select=[@'Languages']")));
        List<WebElement> allOptions =multipleSelectDropdown.getOptions();
        for(WebElement eachOption:allOptions){
            eachOption.click();
            System.out.println("Selected: "+eachOption.getText());

            Assert.assertTrue(eachOption.isDisplayed());
        }
    }
}
