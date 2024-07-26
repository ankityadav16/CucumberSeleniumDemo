package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    protected static WebDriver driver;

    public static void initializeDriver() {
        String os = System.getProperty("os.name").toLowerCase();
        String driverPath = "";

        if (os.contains("win")) {
            driverPath = "./chromedriver/chromedriver.exe";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            driverPath = "./chromedriver-linux64/chromedriver";
        }

        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
