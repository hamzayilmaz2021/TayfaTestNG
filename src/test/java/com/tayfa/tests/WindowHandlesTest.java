package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class WindowHandlesTest {

    @Test
    public void setTest(){
        Set<String> liste = new HashSet<>();
        liste.add("Istanbul");
        liste.add("Ankara");
        liste.add("Zonguldak");

        System.out.println(liste.toString());

    }

    @Test
    public void test(){
        Driver.getDriver().get("https://www.w3schools.com/html/default.asp");
        String w3schoolsHandle = Driver.getDriver().getWindowHandle();

        WebElement facebookLink = Driver.getDriver().findElement(By.xpath("//a[@title='Facebook']"));

        facebookLink.click();
        String facebookHandle = Driver.getDriver().getWindowHandle();

        //Set<String> liste = Driver.getDriver().getWindowHandles();

        ReusableMethods.sleep(3000);
        Driver.getDriver().switchTo().window(w3schoolsHandle);

        ReusableMethods.sleep(3000);
        Driver.getDriver().switchTo().window(facebookHandle);

        ReusableMethods.sleep(3000);
        Driver.getDriver().switchTo().window(w3schoolsHandle);
    }

}
