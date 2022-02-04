package pages;

import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class Base {

    public Base() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}
