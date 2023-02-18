package cydeo.pages;

import cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/*
In this class we will store WebElements common to all pages
 */
public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//button[.='View all products']")
    public WebElement viewAllProducts;

    @FindBy(xpath = "//button[.='Order']")
    public WebElement order;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logoutButton;



}
