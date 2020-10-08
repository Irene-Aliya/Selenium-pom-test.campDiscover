package tests.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampgroundShowPage {
    WebDriver driver;
    @FindBy(tagName = "title")
    WebElement campgroundPageHeader;

    public CampgroundShowPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void campgroundPageHeaderVisibility() {
        System.out.println("visible");
    }

}
