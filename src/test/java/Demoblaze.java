import Utility.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
