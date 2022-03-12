import Utility.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.SignUpPage;

public class Demoblaze {
    WebDriver driver = DriverFactory.getDriver();
    IndexPage indexPage;
    SignUpPage signUpPage;

    @Test
    public void signUp() {
        driver.get("https://www.demoblaze.com/index.html");
        indexPage = new IndexPage();
        signUpPage = new SignUpPage();

        indexPage.clickSignUpButton();
        signUpPage.signUpUser("coderUser", "password");
        DriverFactory.quit();
    }

    @Test
    public void signUp1() {
        driver.get("https://www.demoblaze.com/index.html");
        indexPage = new IndexPage();
        signUpPage = new SignUpPage();

        indexPage.clickSignUpButton();
        signUpPage.signUpUser("coderUser", "password");
        DriverFactory.quit();
    }
}
