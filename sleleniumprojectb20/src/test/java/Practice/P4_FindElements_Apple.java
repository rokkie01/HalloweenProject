package Practice;
/*
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P4_FindElements_Apple {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");

​        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //3. Click to all of the headers one by one
        //a. Mac, iPad, iPhone, Watch, TV, Music, Support
        //4. Print out how many links on each page with the titles of the pages
        //MAC

        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']")).click();
        List<WebElement> linksOnMacPage = driver.findElements(By.xpath("//body//a"));

        String titleOnMacPage = driver.getTitle();
        int linksWithoutTextOnMac = 0;
        int linksWithTextOnMac = 0;

        for(WebElement eachLink : linksOnMacPage ){
            if(eachLink.getText().isEmpty()){
                linksWithoutTextOnMac++;
            }else{
                linksWithTextOnMac++;
            }
        }
            int mac = linksOnMacPage.size();
            System.out.println("Total Number of Links on the page with the title \""+titleOnMacPage+ "\" is " + mac);


            //Iphone
            driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-ipad']")).click();
            driver.findElement(By.xpath("//a[@class ='ac-gn-link ac-gn-link-iphone']")).click();
            driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']")).click();
            driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-tv']")).click();
            driver.findElement(By.xpath("//a[@class= 'ac-gn-link ac-gn-link-music']")).click();
            driver.findElement(By.xpath("//a[@class= 'ac-gn-link ac-gn-link-support']")).click();

        }
    }

 */
