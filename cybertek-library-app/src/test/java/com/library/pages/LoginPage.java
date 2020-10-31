package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public void loginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    private WebElement emailInputBox;

    @FindBy(id = "inputPassword")
    private WebElement passwordInputBox;

    public void loginAsStudent(){
        String username = ConfigurationReader.getProperty("student_username");
        String password = ConfigurationReader.getProperty("student_password");

        emailInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password+ Keys.ENTER);
    }
    public void loginAsLibrarian(){
        String username = ConfigurationReader.getProperty("librarian_username");
        String password = ConfigurationReader.getProperty("librarian_password");

        emailInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password+ Keys.ENTER);
    }
}
