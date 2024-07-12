package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class LoginSteps extends BaseClass {

    @Given("User navigates to the SauceDemo login page")
    public void user_navigates_to_the_SauceDemo_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("inventory.html"));
    }

    @Then("User should see {string}")
    public void user_should_see(String expectedOutcome) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (expectedOutcome.equals("logged in successfully")) {
            String currentUrl = driver.getCurrentUrl();
            assertTrue(currentUrl.contains("inventory.html"));
        } else if (expectedOutcome.equals("an error message")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-test=\"error\"]")));
            String errorMessage = driver.findElement(By.xpath("//*[@data-test=\"error\"]")).getText();
            List<String> expectedMessages = Arrays.asList(
                    "Epic sadface: Sorry, this user has been locked out.",
                    "Epic sadface: Username and password do not match any user in this service"
            );
            boolean matchFound = expectedMessages.stream().anyMatch(errorMessage::contains);
            assertTrue("Error message did not match any expected outcomes", matchFound);
        }
    }
}
