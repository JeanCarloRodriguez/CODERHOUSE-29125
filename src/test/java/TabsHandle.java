import Utility.DriverFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class TabsHandle {
    WebDriver driver = DriverFactory.getDriver();

    @Test
    public void tabs() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.navigate().to("https://www.finning.com/es_AR.html");
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow + "--------------------------");
        driver.findElement(By.cssSelector(".header-additional #email_icon")).click();

        Set<String> allWindowsHandles = driver.getWindowHandles();
        driver.switchTo().window(allWindowsHandles.toArray()[1].toString());
        wait.until(ExpectedConditions.titleContains("Formulario de Contacto"));
        driver.close(); // cerrar tab
        // driver.quit(); cerrar el navegador
        driver.switchTo().window(allWindowsHandles.toArray()[0].toString());
        Assert.assertTrue("waiting for " + driver.getTitle() + " to contains Argentina", driver.getTitle().contains("Argentina"));
    }
}

