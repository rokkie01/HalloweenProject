package Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P3_FindElements_Apple {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.apple.com");
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//"));

        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement eachLink : listOfLinks){
            String textOfEachLink = eachLink.getText();

            System.out.println(textOfEachLink);

            if (textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }
        }

        System.out.println("The number of links that does not have text = " + linksWithoutText);

        System.out.println("The number of links that HAS text = " + linksWithText);

        System.out.println("The number of TOTAL links on this page = " + listOfLinks.size());
    }
}


