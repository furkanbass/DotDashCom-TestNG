package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NotificationMessagePage {
    public NotificationMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
