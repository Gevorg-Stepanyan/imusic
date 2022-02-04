package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverFactory;



public class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/section[2]/div/section/nav/a[1]")
    private WebElement mainButton;

    @FindBy(xpath = "//ul[@id='musicTabs']")
    private WebElement musicTabs;

    @FindBy(xpath = "//span[@id='playerProgressTime']")
    private WebElement progressTime;

    @FindBy(xpath = "//li[@id='playBtn']")
    private WebElement playButton;

    @FindBy(xpath = "//div[3]//div[2]/div/span")
    private WebElement soundRadioButton;

    @FindBy(xpath = "//a[@id='glbSearchBtn']")
    private WebElement searchIcon;

    @FindBy(xpath = "//input[@id='searchBox']")
    private WebElement searchBox;

    @FindBy(xpath = "//div[3]/div/a")
    private WebElement searchCheck;

    @FindBy(css = ".icon-search-new")
    private WebElement searchSting;

    @FindBy(id = "searchBox")
    private WebElement searchBoxForSendkey;

    @FindBy(linkText = "Sting")
    private WebElement stingForClick;

    public  WebElement returnBut(){
        return mainButton;
    }

    public WebElement returnMusicTabs(){
        return musicTabs;
    }

    public WebElement returnProgressTime(){
        return progressTime;
    }

    public String returnValueOfPlayer(){
        //DriverFactory.getDriver().findElement(By.xpath("//span[@id='playerProgressTime']")).getText();
        return  progressTime.getText();
    }

    public WebElement returnPlayButton(){
        return playButton;
    }

    public WebElement returnSoundRadioButton(){
        return soundRadioButton;
    }

    public WebElement returnSearchIcon(){
        return  searchIcon;
    }

    public  WebElement returnSearchBox(){
        return searchBox;
    }

    public WebElement returnSearchCheck(){
        return searchCheck;
    }

    public WebElement stingSearch(){
        return searchSting;
    }

    public  WebElement stingSendkey(){
        return searchBoxForSendkey;
    }

    public  WebElement stingForSearch(){
        return stingForClick;
    }
}
