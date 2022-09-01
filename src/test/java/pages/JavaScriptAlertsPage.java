package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JavaScriptAlertsPage {
    public JavaScriptAlertsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
