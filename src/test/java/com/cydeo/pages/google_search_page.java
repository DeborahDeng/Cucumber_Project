package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class google_search_page {

public google_search_page() {

    PageFactory.initElements(Driver.getDriver(), this);

}
    @FindBy(xpath= "//input[@name= 'q']")
    public WebElement searchBox;
}


