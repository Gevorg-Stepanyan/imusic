package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioPage extends Base{

    // //div[@id='radioLiveBtn']
//
    @FindBy(xpath = "/html/body/section[4]/div/section/section/section/section[2]/div[2]/section/ul/li[1]/ul/li/ul/li[2]/span[2]")
    private WebElement radioLiveButton;

    @FindBy(xpath = "//span[@id='playerProgressTime']")
    private WebElement playerProgressTime;

    @FindBy(xpath = "//div[1]//li[2]/i")
    private WebElement playerButton;

    @FindBy(xpath = "//li[@id='seekForward']")
    private WebElement nextButton;

    @FindBy(xpath = "//li[@id='seekBackward']")
    private WebElement previousButton;

    public WebElement returnRadioLiveButton(){
        return radioLiveButton;
    }

    public WebElement returnPlayerProgressTime(){
        return playerProgressTime;
    }

    public WebElement returnPlayerButton(){
        return playerButton;
    }

    public  WebElement returnNextButton(){
        return nextButton;
    }

    public WebElement returnPreviousButton(){
        return previousButton;
    }

}
