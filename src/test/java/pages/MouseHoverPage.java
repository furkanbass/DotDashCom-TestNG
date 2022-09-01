package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MouseHoverPage {
    public MouseHoverPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
