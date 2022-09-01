package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OpenInNewTabPage {
    public OpenInNewTabPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
