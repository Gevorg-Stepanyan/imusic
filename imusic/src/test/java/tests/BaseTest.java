package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;
import utils.DriverFactory;

public class BaseTest {

    protected static final String BASE_URL = "https://imusic.am/home";


    @BeforeMethod
    void driverSetup(){
        DriverFactory.initDriver(Browser.CHROME);
    }

    @AfterMethod
    void driverQuite(){
        DriverFactory.quitDriver();

    }

    void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
