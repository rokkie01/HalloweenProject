package Practice;

import com.cybertek.utilities.VytrackUtilityLogin;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Vytrack_AC3_4_SecondWay {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        VytrackUtilityLogin.VytrackLogin(driver);

    }
    @Test
    public void edit_odometer() throws InterruptedException {
        driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1'][1]")).click();
        driver.findElement(By.linkText("Vehicle Odometer")).click();

        Thread.sleep(4000);

        WebElement threeDots = driver.findElement(By.xpath("//a[.='...'][1]"));
        threeDots.click();
        driver.findElement(By.xpath("//a[.='...'][1]")).click();

        WebElement viewIcon = driver.findElement(By.xpath("//a[@title='View']"));
        viewIcon.click();

        WebElement editVehicleOdometer = driver.findElement(By.xpath("//a[@title='Edit Vehicle Odometer']"));
        editVehicleOdometer.click();

        Thread.sleep(5000);
        WebElement clearOdometerValue = driver.findElement(By.xpath("//input[@name='custom_entity_type[OdometerValue]']"));
        clearOdometerValue.clear();

        Faker faker= new Faker();
        String odometer = faker.finance().creditCard();
        driver.findElement(By.xpath("//input[@name='custom_entity_type[OdometerValue]']")).
                sendKeys((odometer.substring(0, 4)));

        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='btn-group pull-right']/button")).click();
    }

    }

