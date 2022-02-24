import Utility.DriverFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JPetStore {
    public String url = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
    public WebDriver driver = DriverFactory.getDriver();

    @Test
    public void Registry() {
        driver.manage().window().maximize();
        driver.get(url);
        // User Information
        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.sendKeys("automation" + Math.round(Math.random() * 100));
        WebElement newPasswordInput = driver.findElement(By.name("password"));
        newPasswordInput.sendKeys("Coderhouse123");
        WebElement repeatPasswordInput = driver.findElement(By.name("repeatedPassword"));
        repeatPasswordInput.sendKeys("Coderhouse123");

        //Account Information
        WebElement firstNameInput = driver.findElement(By.name("account.firstName"));
        firstNameInput.sendKeys("Coder");
        WebElement lastNameInput = driver.findElement(By.name("account.lastName"));
        lastNameInput.sendKeys("House");
        WebElement emailInput = driver.findElement(By.name("account.email"));
        emailInput.sendKeys("coderhouse29125@gmail.com");
        WebElement phoneInput = driver.findElement(By.name("account.phone"));
        phoneInput.sendKeys("+(1) 555-523-675");
        WebElement address1Input = driver.findElement(By.name("account.address1"));
        address1Input.sendKeys("Coder avenue");
        WebElement address2Input = driver.findElement(By.name("account.address2"));
        address2Input.sendKeys("Coder Street");
        WebElement cityInput = driver.findElement(By.name("account.city"));
        cityInput.sendKeys("Buenos Aires");
        WebElement stateInput = driver.findElement(By.name("account.state"));
        stateInput.sendKeys("BA");
        WebElement zipInput = driver.findElement(By.name("account.zip"));
        zipInput.sendKeys("0000");
        WebElement countryInput = driver.findElement(By.name("account.country"));
        countryInput.sendKeys("Argentina");

        //Profile Information
        Select languagePreferenceDropdown = new Select(driver.findElement(By.name("account.languagePreference")));
        languagePreferenceDropdown.selectByValue("japanese");
        Select favouriteCategoryDropdown = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
        favouriteCategoryDropdown.selectByValue("CATS");
        WebElement myListCheckbox = driver.findElement(By.name("account.listOption"));
        myListCheckbox.click();
        WebElement myBannerCheckbox = driver.findElement(By.name("account.bannerOption"));
        myBannerCheckbox.click();
        WebElement saveAccountInformationButton = driver.findElement(By.cssSelector("input[name=newAccount]"));
        saveAccountInformationButton.click();

        WebElement mainImageContent = driver.findElement(By.id("MainImageContent"));

        Assert.assertTrue(mainImageContent.isDisplayed());
        driver.quit();
    }
}
