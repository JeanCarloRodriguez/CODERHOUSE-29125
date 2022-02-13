import static org.junit.jupiter.api.Assertions.*;

import Utility.DriverFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTest {
    private String url = "https://www.google.com";
    private WebDriver driver = DriverFactory.getDriver();

    @Test
    public void NavigateToGoogle() {
        driver.navigate().to(url);
        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        searchInput.sendKeys("Selenium", Keys.ENTER);
        assertEquals("Selenium - Buscar con Google", driver.getTitle());
        driver.quit();
    }
}