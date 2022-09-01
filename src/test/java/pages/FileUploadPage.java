package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FileUploadPage {
    public FileUploadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
