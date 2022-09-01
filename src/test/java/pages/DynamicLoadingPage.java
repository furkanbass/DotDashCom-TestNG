package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DynamicLoadingPage {
    public DynamicLoadingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
