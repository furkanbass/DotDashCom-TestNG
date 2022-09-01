package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicContentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class DynamicContent extends TestBase {

    DynamicContentPage dynamicContentPage;
    @Test()
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("dynamicContent"));
        String expectedimg1 = dynamicContentPage.img1.getText();
        String expectedimg2 = dynamicContentPage.img2.getText();
        String expectedimg3 = dynamicContentPage.img3.getText();



        dynamicContentPage.clickHere.click();
        String actualimg1 = dynamicContentPage.img1.getText();
        String actualimg2 = dynamicContentPage.img2.getText();
        String actualimg3 = dynamicContentPage.img3.getText();

        Assert.assertEquals(actualimg1,expectedimg1);
        Assert.assertEquals(actualimg2,expectedimg2);
        Assert.assertEquals(actualimg3,expectedimg3);



    }
}
