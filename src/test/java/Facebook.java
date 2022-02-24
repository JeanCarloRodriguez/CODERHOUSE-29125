import Utility.DriverFactory;
import Utility.PropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
    public String url = "https://facebook.com";
    public WebDriver driver = DriverFactory.getDriver();

    @Test
    public void typeEmail() {
        driver.get(url);
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("coderhouse@coder.com");
    }

    @Test
    public void forgotLink() {
        driver.get(url);
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
        forgotPasswordLink.click();
    }

    @Test
    public void loginButton()  {
        driver.get(url);
        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();
    }

    @Test
    public void password()  {
        driver.get(url);
        WebElement passwordInput = driver.findElement(By.className("_9npi"));
        passwordInput.sendKeys("password123456");
    }

    // Css Selectors

    @Test
    public void typeEmailCss() {
        driver.get(url);
        WebElement emailInput = driver.findElement(By.cssSelector("input#email"));
        emailInput.sendKeys("coderhouse@coder.com");
    }

    @Test
    public void passwordCss()  {
        driver.get(url);
        WebElement passwordInput = driver.findElement(By.cssSelector("._9npi"));
        passwordInput.sendKeys("password123456");
    }

    @Test
    public void loginButtonCss()  {
        driver.get(url);
        WebElement loginButton = driver.findElement(By.cssSelector("button[name=\"login\"]"));
        loginButton.click();
    }
}
