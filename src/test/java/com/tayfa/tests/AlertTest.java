package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertTest {

    @Test
    public void test(){

        /*
            WebElement kabulLinki = Driver.getDriver().findElement(By.xpath("//a[@onclick='removeCookiePolicy()']"));
            kabulLinki.click();
        */

        Driver.getDriver().get("https://www.tutorialsteacher.com/codeeditor?cid=js-1");

        ReusableMethods.sleep(2000);

        // Alert'e geçiş yaptık.

        Alert alert1 = Driver.getDriver().switchTo().alert();
        String icerik1 = alert1.getText();
        alert1.accept();

        Alert alert2 = Driver.getDriver().switchTo().alert();
        String icerik2 = alert2.getText();
        alert2.accept();

        Alert alert3 = Driver.getDriver().switchTo().alert();
        String icerik3 = alert3.getText();
        alert3.accept();

        System.out.println(icerik1);
        System.out.println(icerik2);
        System.out.println(icerik3);


        WebElement homeLinki = Driver.getDriver().findElement(By.xpath("//a[@title='TutorialsTeacher.com Home']"));

        homeLinki.click();

    }

}
