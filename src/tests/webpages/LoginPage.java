package tests.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(how = How.ID, using = "test-username")
    WebElement userNameInput;
    @FindBy(how = How.ID, using = "test-password")
    WebElement passwordInput;

    @FindBy(name = "test-login-btn")
    WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String strUsername) {
        userNameInput.sendKeys(strUsername);
    }

    public void setPassword(String strPassword) {
        passwordInput.sendKeys(strPassword);
    }

    public CampgroundsPage clickLoginBtn() {

        loginBtn.click();
        return new CampgroundsPage(driver);
    }
}
