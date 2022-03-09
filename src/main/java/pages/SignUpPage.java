package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    @FindBy(id = "sign-username")
    WebElement usernameInput;

    @FindBy(id = "sign-password")
    WebElement passwordInput;

    @FindBy(linkText = "Sign up")
    WebElement signUpButton;

    public SignUpPage() {
        PageFactory.initElements(this.driver, this);
    }

    public void signUpUser(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        Actions builder = new Actions(this.driver);
        Action action = builder
                .moveToElement(signUpButton)
                .click()
                .build();
        action.perform();
    }
}
