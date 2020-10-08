package tests.testcases;

import org.testng.annotations.Test;
import tests.webpages.CampgroundShowPage;
import tests.webpages.CampgroundsPage;
import tests.webpages.LandingPage;


public class LandingPageTest extends TestBase {
    @Test(priority = 1)
    public void init() {
        LandingPage landingPage = new LandingPage(webDriver);
        CampgroundsPage campgroundsPage = landingPage.clickViewAllBtn();

        webDriver.navigate().back();
        campgroundsPage = landingPage.landingSearch("island");
        CampgroundShowPage campgroundShowPage = campgroundsPage.clickMoreInfoBtn();
        campgroundShowPage.campgroundPageHeaderVisibility();

    }


}
