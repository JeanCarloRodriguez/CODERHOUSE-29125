import Data.FacebookUsers;
import Utility.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DataProviderTest {
    WebDriver driver = DriverFactory.getDriver();

    @Test(groups = {"Facebook"}, dataProvider = "FacebookUsers", dataProviderClass = FacebookUsers.class)
    public void facebookUsersTest(String user, String password, Boolean logged) {
        driver.navigate().to("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys(user);
        driver.findElement(By.id("pass")).sendKeys(password);
    }

}
