import Utility.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {
    final String URL = "https://www.demoblaze.com/prod.html?idp_=1#";
    WebDriver driver = DriverFactory.getDriver();

    @Test
    public void alertTest() {
        driver.get(URL);
        driver.findElement(By.linkText("Add to cart")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
