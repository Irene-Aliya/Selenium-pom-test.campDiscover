package tests.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    public static WebDriver webDriver;

    @BeforeTest
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        try {

            webDriver = new ChromeDriver();//实例化
            webDriver.get("http://localhost:3000");
            webDriver.manage().window().maximize();

//            webDriver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
//            Thread.sleep(2000);
//            webDriver.navigate().back();
//            Thread.sleep(2000);
//            webDriver.navigate().forward();
//            Thread.sleep(2000);
//            webDriver.manage().window().setSize(new Dimension(480, 800));
//            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @AfterTest
    public void teardown() {
        if (webDriver != null)
            webDriver.quit();


    }

}
