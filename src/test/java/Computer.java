import Utility.DriverFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Computer {
    public WebDriver driver = DriverFactory.getDriver();
    public String URL = "http://computer-database.gatling.io/computers";

    @Test
    public void addComputer() {
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement addANewComputerButton = driver.findElement(By.xpath("//a[text()='Add a new computer']"));
        addANewComputerButton.click();

        WebElement computerNameInput = driver.findElement(By.xpath("//span[text()='Required']//preceding-sibling::input"));
        computerNameInput.sendKeys("HP");

        WebElement introduceInput = driver.findElement(By.xpath("//label[text()='Introduced']//following-sibling::div/input"));
        introduceInput.sendKeys("2020-02-02");

        WebElement discontinuedInput = driver.findElement(By.xpath("//input[starts-with(@name, 'dis')]"));
        discontinuedInput.sendKeys("2022-02-04");

        Select languagePreferenceDropdown = new Select(driver.findElement(By.xpath("//select[starts-with(@id, 'comp')]\n")));
        languagePreferenceDropdown.selectByVisibleText("Sony");

        WebElement createThisComputerButton = driver.findElement(By.xpath("//input[@value='Create this computer']"));
        createThisComputerButton.click();

        WebElement alertMessage = driver.findElement(By.xpath("//div[@class='alert-message warning']"));

        Assert.assertEquals("Done ! Computer HP has been created", alertMessage.getText());
        driver.quit();
    }

}
