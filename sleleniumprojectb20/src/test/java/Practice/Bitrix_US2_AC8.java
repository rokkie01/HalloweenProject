package Practice;

import com.cybertek.utilities.BitrixLogIn;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Bitrix_US2_AC8 {

//US#2 - AC#8. User can assign the tasks to employees by clicking on
// Add More and selecting contact from E-mail user,
// Employees and Departments and Recent contact lists.
// Employees can be added in different assignment categories:
// Created By, Participants and Observer.
    WebDriver driver;

    @BeforeMethod
    public void Assignment5_US2_AC8() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
        BitrixLogIn.logIntoBitrix(driver);

    }

    @Test
    public void add_new_task_and_deadline() {
        WebElement taskButton = driver.findElement(By.xpath("//a[@title='Tasks']"));
        taskButton.click();

        WebElement addButton = driver.findElement(By.id("tasks-buttonAdd"));
        addButton.click();

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class= 'side-panel-iframe']"));
        driver.switchTo().frame(iframe);
        BrowserUtils.wait(2);

        WebElement participantsAddButton = driver.findElement(By.xpath("//span[.='Participants'][1]"));
        participantsAddButton.click();

        BrowserUtils.wait(2);

        WebElement observersButton = driver.findElement(By.xpath("//span[.='Observers'][1]"));
        observersButton.click();

        WebElement thingsToDoTab = driver.findElement(By.xpath("//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']"));
        thingsToDoTab.sendKeys("This is a new task");

        WebElement addTextSubmitButton = driver.findElement(By.xpath("//button[@class='ui-btn ui-btn-success']"));
        addTextSubmitButton.click();

        BrowserUtils.wait(1);

        driver.switchTo().defaultContent();
        
        //It is the verification Test
        WebElement newTaskWasCreated = driver.findElement(By.partialLinkText("This is a new task"));

        Assert.assertTrue(newTaskWasCreated.isDisplayed(),"Message is NOT displayed, verification FAILED!!!");
    }
}

