package com.tayfa.tests;

import com.tayfa.pages.AmazonPage;
import com.tayfa.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AmazonAramaTest {

    AmazonPage page = new AmazonPage();




    @Test
    public void aramaTesti(){

        Driver.getDriver().get("https://amazon.com");
        // aramakutusuna iphone yaz ve ara.

        page.aramaKutusu.sendKeys("iphone"+ Keys.ENTER);

    }

}
