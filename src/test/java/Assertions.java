import Utility.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    WebDriver driver = DriverFactory.getDriver();

    @Test
    public void facebook() {
        driver.get("https://www.facebook.com");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up"); // passed
        softAssert.assertEquals(driver.getCurrentUrl(), "google", "no hace match on  el URL"); // failed
        System.out.println("Test terminado");
        Assert.assertTrue(false); // passed
        softAssert.assertAll();
    }

    @Test
    public void testCasetwo() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("*** test case two started ***");
        softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
        System.out.println("hard assert success....");
        softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
        softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
        System.out.println("*** test case two executed successfully ***");
        softAssert.assertAll();
    }
}
