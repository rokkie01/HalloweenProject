package Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_Cybertekcom_AddRemoveElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Delete button is displayed. Verification passed!");
        } else {
            System.out.println("Delete button is not displayed. Verification failed!");
        }
        deleteButton.click();

        if (!deleteButton.isDisplayed()) {
            System.out.println("Delete button is NOT displayed after clicking.PASS!");
        } else {
            System.out.println("Delete button is displayed after clicking. Failed!");
        }
        try {
            if (!deleteButton.isDisplayed()) {
                System.out.println("Delete button is NOT displayed after clicking.PASS!");
            } else {
                System.out.println("Delete button is displayed after clicking. Failed!");
            }
        } catch (StaleElementReferenceException exception) {
            System.out.println("StaleElementException has been thrown");
            System.out.println("it means element has been completely deleted");
            System.out.println("Delete button was removed");
        }
    }
}
