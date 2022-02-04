package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utils.*;

import java.util.concurrent.TimeUnit;

public class BasePageTest extends BaseTest {

    @Test
    void playPlayer(){
        BasePage bp = new BasePage();
        DriverFactory.getDriver().get("https://imusic.am/home");
        ScreenRecorderUtil.startRecord("start_play");
        System.out.println(bp.returnValueOfPlayer());
        Assert.assertTrue(bp.returnValueOfPlayer().equals("00:00"));
        TakeScreenShot.takeScreen("before_play_player");
        ActionHelper.clickOnElement(bp.returnPlayButton());
        sleep(5);
        TakeScreenShot.takeScreen("after_play_player");
        Assert.assertTrue(bp.returnValueOfPlayer().equals("00:04"));
        System.out.println("PLayer played 4 seconds:");
        ScreenRecorderUtil.stopRecord();
    }

    @Test
    void soundRadioButton() throws Exception {

        ScreenRecorderUtil.startRecord("soundButton");
        BasePage bp = new BasePage();
        DriverFactory.getDriver().get("https://imusic.am/home");
        DriverFactory.getDriver().manage().window().maximize();
        WebElement radioButton = bp.returnSoundRadioButton();
        Actions act = new Actions(DriverFactory.getDriver());
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        act.click(bp.returnPlayButton()).build().perform();
        TakeScreenShot.takeScreen("radiobutton_start");
        int up = 2;
        while (up < 20){
            act.dragAndDropBy(radioButton, up,0).build().perform();
            up +=2;
        }
        TakeScreenShot.takeScreen("radiobutton_100%");
        sleep(4);
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ScreenRecorderUtil.stopRecord();
    }

    @Test
    void searchCase()  {
        String search = "Sting";
        BasePage bp = new BasePage();
        ScreenRecorderUtil.startRecord("start_search");
        DriverFactory.getDriver().get("https://imusic.am/home");
        DriverFactory.getDriver().manage().window().maximize();
        TakeScreenShot.takeScreen("before_Search_Icon_Click");
        DriverFactory.getDriver().navigate().refresh();
        ActionHelper.clickOnElement(bp.stingSearch());
        ActionHelper.sendKeyAction(bp.stingSendkey(),search);
        ActionHelper.clickOnElement(bp.stingForSearch());
        String res = DriverFactory.getDriver().findElement(By.cssSelector("h1 span")).getText();
        TakeScreenShot.takeScreen("after_Search_Icon_Click");
        Assert.assertTrue(res.equals(search));
        ScreenRecorderUtil.stopRecord();

    }

}
