package Practice;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P_11_Delete_MarkSmith {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
    }

    @Test
    public void p_11_Delete_MarkSmith() {

        //WebElement markSmithText = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[3]/td[2]"));
        WebElement markSmithCheckBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl03_OrderSelector']"));
        markSmithCheckBox.click();

        WebElement findDeleteButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']"));
        findDeleteButton.click();

        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ct100_MainContent_OrderGrid']//tr/td[2]"));

        for (WebElement each : namesList) {
            Assert.assertFalse(each.getText().equals("Mark Smith"));
        }
    }
}
