package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JavaScriptErrorPage {
    public JavaScriptErrorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
