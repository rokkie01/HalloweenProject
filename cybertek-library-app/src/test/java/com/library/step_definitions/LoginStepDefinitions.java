package com.library.step_definitions;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));

    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {


    }

    @When("I login as a student")
    public void i_login_as_a_student() {

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

    }

}



