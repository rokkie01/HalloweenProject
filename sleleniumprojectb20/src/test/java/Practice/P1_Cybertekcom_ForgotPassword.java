package Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_Cybertekcom_ForgotPassword {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement emailText = driver.findElement(By.xpath("//label[.='E-mail']"));

        WebElement emailInputBox=driver.findElement(By.cssSelector("input[name='email']"));

        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));

        WebElement retrievePassword2 = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin'))"));

       // WebElement poweredByCybertek = driver.findElement(By.xpath(""))
    }
    }

