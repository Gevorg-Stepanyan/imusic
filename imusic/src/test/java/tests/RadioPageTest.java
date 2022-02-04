package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RadioPage;
import utils.ActionHelper;
import utils.DriverFactory;
import utils.ScreenRecorderUtil;
import utils.TakeScreenShot;


public class RadioPageTest extends BaseTest{

    @Test
    void playerRadio()  {
        ScreenRecorderUtil.startRecord("radioButton");
        DriverFactory.getDriver().get("https://imusic.am/radio/classic");
        DriverFactory.getDriver().manage().window().maximize();
        RadioPage rp = new RadioPage();
        DriverFactory.getDriver().navigate().refresh();
        String start = rp.returnPlayerProgressTime().getText();
        TakeScreenShot.takeScreen("Radio_Live_Button_Before_Play");
        ActionHelper.clickOnElement(rp.returnRadioLiveButton());
        sleep(5);
        Assert.assertTrue(!start.equals(rp.returnPlayerProgressTime().getText()));
        TakeScreenShot.takeScreen("Radio_Live_Button_After_Play");
        System.out.println("Live button work correctly");
        ScreenRecorderUtil.stopRecord();
    }
}
