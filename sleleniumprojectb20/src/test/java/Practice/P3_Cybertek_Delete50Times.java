package Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P3_Cybertek_Delete50Times {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        // 3. Click to “Add Element” button 50 times
        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));

        for (int i = 0; i < 50; i++) {
            addElement.click();
        }
        List<WebElement> listOfDeleteButtons = driver.findElements(By.xpath("//button[.='Delete']"));
        System.out.println("Number of Displayed Buttons:" + listOfDeleteButtons.size());// 4. Verify 50 “Delete” button is displayed after clicking.

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));

        // 5. Click to ALL “Delete” buttons to delete them.
        for (WebElement button : listOfDeleteButtons) {
            button.click();
        }
        // 6. Verify “Delete” button is NOT displayed after clicking.
        try {
            if (!deleteButton.isDisplayed()) {
                System.out.println("Delete button is NOT displayed after clicking.PASS!");
            } else {
                System.out.println("Delete button is displayed after clicking. Failed!");
            }
        } catch (StaleElementReferenceException exception) {
            System.out.println("StaleElementException has been thrown");
            System.out.println("it means element has been completely deleted");
            System.out.println("Delete buttons were removed");
        }
    }
}