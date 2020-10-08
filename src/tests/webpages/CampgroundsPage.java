package tests.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CampgroundsPage {
    WebDriver driver;
    @FindBy(how = How.ID, using = "testMoreInfoBtn")
    WebElement moreInfoBtn;

    @FindBy(id = "test-login-btn")
    WebElement goToLoginPageBtn;

    public CampgroundsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickGoToLoginPageBtn() {
        goToLoginPageBtn.click();
        return new LoginPage(driver);
    }

    public CampgroundShowPage clickMoreInfoBtn() {
        moreInfoBtn.click();
        return new CampgroundShowPage(driver);
    }

}
