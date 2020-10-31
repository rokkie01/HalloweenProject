package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vytrack_AC3_3rdAssignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.id("prependedInput")).sendKeys("user172");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        driver.findElement(By.id("_submit")).click();

        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("Activities")).click();

        driver.findElement(By.linkText("Calendar Events")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@title='Create Calendar event']")).click();

        Thread.sleep(3000);

        driver.findElement(By.name("oro_calendar_event_form[title]")).sendKeys("Irene Varol");
        Thread.sleep(2000);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@style='width: 100%; height: 160px; display: block;']"));

        Thread.sleep(2000);
        driver.switchTo().frame(iframe);


        Thread.sleep(2000);


        driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                " when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        driver.switchTo().defaultContent();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='btn btn-success action-button']")).click();
        Thread.sleep(2000);


        if (driver.findElement(By.linkText("General Information")).isDisplayed() && driver.findElement(By.xpath("//div[@class='control-label'][1]")).isDisplayed()){
            System.out.println("VTruck Driver Add Event Verification PASSED");
        }else {
            System.out.println("VTruck Driver Add Event Verification FAILED");
        }
    }
}