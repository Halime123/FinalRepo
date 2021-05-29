package com.OrangeHRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",//run yapacagimiz feature in pathini buraya yapistiriyoruz.
        glue = "com.OrangeHRM.stepDefinitions",
        dryRun = false
       // tags="@dtWithHeader"
        ,strict = true,
        plugin={"pretty",
                "html:target/cucumber-default-reports",
                "rerun:target/FailedTests.txt",
                "json:target/cucumber.json"})

public class TestRunner {

}
