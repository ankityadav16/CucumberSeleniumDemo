package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\CucumberSeleniumDemo\\features", // Path to the feature files
        glue = {"stepDefinitions", "hooks"}, // Package containing step definitions
        plugin = {
                "pretty",
                "html:reports/cucumber-reports.html", // HTML report in custom folder
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // ExtentReports adapter
        },
        monochrome = true // Better console output readability
)
public class TestRunner {
        // This class will be used as an entry point to run the Cucumber tests
}
