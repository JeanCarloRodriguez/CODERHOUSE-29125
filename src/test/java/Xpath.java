import Utility.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {
    public String url = "https://facebook.com";
    public WebDriver driver = DriverFactory.getDriver();

    @Test
    public void typeEmail() {
        driver.get(url);
        // WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));
        // WebElement emailInput = driver.findElement(By.xpath("//input[contains(@id, 'em')]"));
        WebElement emailInput = driver.findElement(By.xpath("//input[starts-with(@id, 'em')]"));
        emailInput.sendKeys("coderhouse@coder.com");
    }

    @Test
    public void LogIn() {
        driver.get(url);
        // WebElement logInButton = driver.findElement(By.xpath("//button[text()='Log In']"));
        // Mezclando contains() con text() //button[contains(text(), 'Log In')]
        WebElement logInButton = driver.findElement(By.xpath("//button[contains(text(), 'Log In')]"));
        logInButton.click();
    }
}
