package org.example.cucumbertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Deposit.feature",
        glue = {
                "org.example.definition"
        },
        monochrome = true, plugin  = { "pretty",
        "html:target/cucumber-reports/cucumber-reports.html",
        "json:target/cucumber-reports/cucumber-reports.json",

       }
)
public class CucumberTest {

}