package tests.testcases;

import org.testng.annotations.Test;
import tests.webpages.CampgroundShowPage;
import tests.webpages.CampgroundsPage;
import tests.webpages.LandingPage;
import tests.webpages.LoginPage;

public class LoginPageTest extends TestBase {
    @Test(priority = 2)
    public void init() {
        LandingPage landingPage = new LandingPage(webDriver);
        CampgroundsPage campgroundsPage = landingPage.clickViewAllBtn();
        //CampgroundsPage campgroundsPage = new CampgroundsPage(webDriver);
        LoginPage loginPage = campgroundsPage.clickGoToLoginPageBtn();

        loginPage.setUsername("Guest01");
        loginPage.setPassword("guest123");

        campgroundsPage = loginPage.clickLoginBtn();
        CampgroundShowPage campgroundShowPage = campgroundsPage.clickMoreInfoBtn();
        campgroundShowPage.campgroundPageHeaderVisibility();

    }
}
