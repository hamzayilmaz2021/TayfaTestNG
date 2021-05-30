package com.tayfa.pages;

import com.tayfa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class W3Schools {

    public W3Schools(){
        PageFactory.initElements( Driver.getDriver() ,  this );
    }

    @FindBy ( xpath = "(//table)[1]//th" )
    public List<WebElement> basliklar;

    @FindBy ( xpath =  "(//table)[1]/tbody//td")
    public List<WebElement> hucreler;

}
