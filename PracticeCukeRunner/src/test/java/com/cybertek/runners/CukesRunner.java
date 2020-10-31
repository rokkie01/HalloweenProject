package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = "html:target/cucumber-report.html",
            features = "src/test/resources/features",//getting from the source, always for features because it is not in the same folder
            glue = "com/cybertek/step_definitions",
            dryRun = false,
            tags =  "@LoginWithBackground"
    )
    public class CukesRunner {

    }
