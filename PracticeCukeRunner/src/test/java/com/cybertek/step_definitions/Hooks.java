package com.cybertek.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @io.cucumber.java.Before
    public void setUpScenario(){
        System.out.println("------> Before annotation: Setting up browser");
    }
    @Before("@db")
    public void setUpDataBaseConnection(){
        System.out.println("--------> Before annotation: DB Connection Created");

    }
    @After
    public void tearDownScenario(){
        System.out.println("-------> After annotation: Closing browser");
    }
    @After("@db")
    public void tearDownDatabaseConnection(){
        System.out.println("------> After Annotation: DB Connction closed <----------");
    }
}
