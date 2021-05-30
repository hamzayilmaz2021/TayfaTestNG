package com.tayfa.tests;

import com.tayfa.pages.W3Schools;
import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {

    W3Schools schools = new W3Schools();

    @Test
    public void tumBasliklar(){
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        // List<WebElement>


        for (WebElement element : schools.basliklar) {

            System.out.println(element.getText());

        }

    }

    @Test
    public void tumHucreler(){
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        for(WebElement element : schools.hucreler){
            System.out.println(element.getText());
        }
    }

    @Test
    public void tumBasliklarReusableMethods(){
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        List<WebElement> liste = ReusableMethods.getBasliklar();

        for(WebElement element : liste){
            System.out.println(element.getText());
        }
    }

    @Test
    public void satirSutunTesti() {
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        WebElement element = ReusableMethods.getSatirSutun(6,3);

        System.out.println(element.getText());
    }
}
