package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage {
    @FindBy(xpath = "//a[@id='signin2']")
    WebElement signUpButton;

    public IndexPage() {
        PageFactory.initElements(this.driver, this);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }
}
