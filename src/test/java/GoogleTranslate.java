import Utility.DriverFactory;
import Utility.PropertiesFile;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class GoogleTranslate {
    public String url = "https://translate.google.com/?hl=" + PropertiesFile.getProperty("language");
    public WebDriver driver = DriverFactory.getDriver();

    @Test
    public void googleTranslate() {
        driver.get(url);
    }
}
