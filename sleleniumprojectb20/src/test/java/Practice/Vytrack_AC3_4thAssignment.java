package Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vytrack_AC3_4thAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user172");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();

        Thread.sleep(2000);

       driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1'][1]")).click();
       driver.findElement(By.linkText("Vehicle Odometer")).click();

        Thread.sleep(4000);

       driver.findElement(By.xpath("//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-OdometerValue'][1]")).click();

       Thread.sleep(3000);

       driver.findElement(By.xpath("//a[@title='Edit Vehicle Odometer']")).click();

       Thread.sleep(5000);
       driver.findElement(By.xpath("//input[@name='custom_entity_type[OdometerValue]']")).clear();

       driver.findElement(By.xpath("//input[@name='custom_entity_type[OdometerValue]']")).sendKeys("123");

        Thread.sleep(5000);
       driver.findElement(By.xpath("//div[@class='btn-group pull-right']/button")).click();
    }
}
