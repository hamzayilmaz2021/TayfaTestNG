package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleAramaTest {

    @Test
    public void aramaTesti(){


        // Driver'ı başlatır ve google'a gider.
        Driver.getDriver().get("https://www.amazon.com");

        WebElement aramaKutusu2 = Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("telefon");

        Driver.getDriver().navigate().to("https://www.amazon.com/AmazonBasics-Ear-Headphones-Mic-Black/dp/B07HH1QSLB/ref=sxin_5_trfob_0?cv_ct_cx=headphones&dchild=1&keywords=headphone&pd_rd_i=B07HH1QSLB&pd_rd_r=0bbe1ea0-6945-4453-aaeb-c82a5795e78a&pd_rd_w=TwVIK&pd_rd_wg=jN47U&pf_rd_p=6c6f0ed1-2306-4f6f-832e-d796b7d41a25&pf_rd_r=0D0E2KVA3AYQNAQY4BHB&qid=1620581814&sr=1-1-fcc74f9e-0165-48d2-a9e1-f41ea92a035c");


        WebElement baslik = Driver.getDriver().findElement(By.tagName("h1"));
        String baslikString = baslik.getText();
        System.out.println(baslikString);

        WebElement cevaplananSorular = Driver.getDriver().findElement(By.partialLinkText("50 answered questions"));
        String cevaplananSorularString = cevaplananSorular.getText();
        System.out.println(cevaplananSorularString);

        List<WebElement> linkler = Driver.getDriver().findElements(By.tagName("a"));

        for(WebElement element : linkler){
            System.out.println(element.getText());
        }


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
