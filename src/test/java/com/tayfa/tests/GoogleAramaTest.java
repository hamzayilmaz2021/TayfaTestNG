package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class GoogleAramaTest {

    @Test
    public void aramaTesti(){

        // Driver'ı başlatır ve google'a gider.
        Driver.getDriver().get("https://www.amazon.com");

        /*
        // 5 sn beklesin
        ReusableMethods.sleep(2000);

        // Başlığı alalım
        String baslik = Driver.getDriver().getTitle();
        System.out.println(baslik);

        // Amazon.com'a gidelim
        Driver.getDriver().navigate().to("https://www.amazon.com");

        // Başlığı alalım
        String baslikAmazon = Driver.getDriver().getTitle();
        System.out.println(baslikAmazon);

        // Google.com'a geri dönelim.
        Driver.getDriver().navigate().back();

        ReusableMethods.sleep(2000);

        // Amazon.com'a geri dönelim.
        Driver.getDriver().navigate().forward();

        // driver classı içerisindeki close methodunu çağırır
        Driver.closeDriver();
        */
    }


}
