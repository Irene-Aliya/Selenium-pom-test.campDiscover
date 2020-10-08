package tests.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    @FindBy(id = "testViewAll")
    WebElement viewAllBtn;
    @FindBy(name = "search")
    WebElement searchInput;
    @FindBy(name = "search-btn")
    WebElement searchBtn;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CampgroundsPage clickViewAllBtn() {
        viewAllBtn.click();
        return new CampgroundsPage(driver);
    }

    public CampgroundsPage landingSearch(String strSearchInput) {
        searchInput.sendKeys(strSearchInput);
        searchBtn.click();
        return new CampgroundsPage(driver);
    }

}
