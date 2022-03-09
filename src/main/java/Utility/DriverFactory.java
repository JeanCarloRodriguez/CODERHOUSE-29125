package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriver() {
        if(driver == null) {
            String browser = PropertiesFile.getProperty("browser");
            switch (browser) {
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                case "edge" -> {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
            }
            // Implicit wait
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            // Explicit wait
            wait = new WebDriverWait(driver, 10);
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    /**
     * Quit the web explorer and remove the driver instance
     */
    public static void quit() {
        driver.quit();
        driver = null;
    }
}
