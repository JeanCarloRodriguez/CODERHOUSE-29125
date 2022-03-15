import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PruebasEnParalelo {

    @Test(groups = {"Ebay"})
    public void ebay() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        Assert.assertTrue(false); // failed
        driver.quit();
    }

    @Test(groups = {"Amazon"})
    public void amazon() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.quit();
    }
}
