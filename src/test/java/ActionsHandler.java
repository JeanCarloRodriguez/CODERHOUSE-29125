import Utility.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionsHandler {
    WebDriver driver = DriverFactory.getDriver();

    @Test
    public void mouseMoveToElement() {
        driver.get("https://google.com");
        WebElement micButton = driver.findElement(By.xpath("//div[@aria-label='Búsqueda por voz']"));
        Actions builder = new Actions(driver);
        Action action = builder
                .moveToElement(micButton)
                .build();
        action.perform();
    }
}
