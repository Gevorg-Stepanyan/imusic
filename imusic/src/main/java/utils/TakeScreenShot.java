package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    static WebDriver driver = DriverFactory.getDriver();

    public static void takeScreen(String fileName)  {

        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("C:/Users/USER/IdeaProjects/imusic/src/main/resources/ScreenShots/"+ fileName +".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
