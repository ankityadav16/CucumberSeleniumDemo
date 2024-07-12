package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    protected static WebDriver driver;

    public static void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\CucumberSeleniumDemo\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
