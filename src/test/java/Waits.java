import Utility.DriverFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public String url = "https://www.demoblaze.com/index.html";
    public WebDriver driver = DriverFactory.getDriver();

    @Test
    public void implicitWait() {
        // el codigo para user implicit wait fue movido de esta linea al DriverFactory
        driver.get(url);
        driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]")).click();
    }

    @Test
    public void explicitWait() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get(url);
        driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sony vaio i5')]"))).click();
    }

    @Test
    public void fluentWait() {
        driver.get("https://www.speedtest.net/");
        By goButtonSelector = By.cssSelector("div.start-button a");
        By downloadSpeedSelector = By.className("download-speed");
        WebElement goButton = driver.findElement(goButtonSelector);
        goButton.click();
        // Fluent wait
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(45));
        wait.pollingEvery(Duration.ofSeconds(5));
        // Esperar a que el boton Go no este visible
        wait.until(ExpectedConditions.invisibilityOfElementLocated(goButtonSelector));
        // Ahora esperaremos a que vuelva esar visible, eso quiere decir que la prueba de velocidad termino
        wait.until(ExpectedConditions.elementToBeClickable(goButtonSelector));
        WebElement downloadSpeedSpan = driver.findElement(downloadSpeedSelector);

        Assert.assertTrue(Double.parseDouble(downloadSpeedSpan.getText()) > 10.0);
    }
}
