package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Map;

public class CreateCalendarEventPage {

    @Given("user clicks on create calendar event button")
    public void user_clicks_on_create_calendar_event_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("user adds new calendar event information")
    public void user_adds_new_calendar_event_information(Map<String, String> data) {
        String title = data.get("Title");
        String description = data.get("Description");


    }
}
