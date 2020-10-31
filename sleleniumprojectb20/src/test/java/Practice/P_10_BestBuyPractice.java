package Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P_10_BestBuyPractice {

    WebDriver driver;

    @BeforeMethod

    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.bestbuy.com/");
    }
    @Test
    public void circleThroughTheTabs(){

        //WebElement fullbreedWrapper = driver.findElement(By.xpath("//button[@class='"));
        //fullbreedWrapper.click();
       List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println(listOfLinks.size());

        for(WebElement eachlink: listOfLinks){
            if(eachlink.getText().contains("Cards")){
                System.out.println(eachlink.getText());
            }
        }

    }

}
