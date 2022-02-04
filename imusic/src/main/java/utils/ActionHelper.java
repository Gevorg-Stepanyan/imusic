package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionHelper {



    public static void clickOnElement(WebElement element){
        Actions actions = new Actions(DriverFactory.getDriver());
        System.out.println("Waiting until element is visible: "+ element);
        WaitHelper.waitUntilElementIsVisible(element);
        System.out.println("Waiting until element is clickable: "+ element);
        WaitHelper.waitUntilElementIsClickable(element);
        actions.click(element).build().perform();
        System.out.println("Successfully click element:"+ element);
    }

    public static void waitUntilElementIsVisible(WebElement element){
        Actions actions = new Actions(DriverFactory.getDriver());
        System.out.println("Waiting until element is visible: "+ element);
        WaitHelper.waitUntilElementIsVisible(element);
    }


    public static void sendKeyAction(WebElement element, String text){
        Actions actions = new Actions(DriverFactory.getDriver());
        System.out.println("Waiting until element is visible: "+ element);
        WaitHelper.waitUntilElementIsVisible(element);
        actions.sendKeys(text).build().perform();
        System.out.println("Successfully text inputed:"+ element);
    }


}
