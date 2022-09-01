package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FileDownloadPage {
    public FileDownloadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
