package Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P5_Cybertek_AddRemoveWebelemnts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));

        for(int i=0; i<50; i++){

            addElementButton.click();

            List<WebElement> listOfDeleteButton = driver.findElements(By.xpath("//button[.='Delete']"));
            System.out.println("listOfDeleteButton.size() = " + listOfDeleteButton.size());
            Thread.sleep(3000);

            //List<WebElement> deleteButtons = driver.findElement(By.xpath("//div[@id='elements']"));

        }
    }
}
