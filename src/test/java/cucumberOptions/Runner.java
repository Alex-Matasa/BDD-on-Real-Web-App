package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = {"stepDefinitions"},
                 tags = "@all",
                 monochrome = true, dryRun = false,
                 plugin = {"pretty", "html:target/cucumber.html"})

public class Runner extends AbstractTestNGCucumberTests {



}
