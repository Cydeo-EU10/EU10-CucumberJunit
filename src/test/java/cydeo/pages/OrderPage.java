package cydeo.pages;

import cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

public class OrderPage extends BasePage {

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    @FindBy(name = "name")
    public WebElement inputName;

    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;

    @FindBy(name = "state")
    public WebElement inputState;

    @FindBy(name = "zip")
    public WebElement inputZip;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(name = "cardNo")
    public WebElement cardNoInput;

    @FindBy(name = "cardExp")
    public WebElement cardExpInput;

    @FindBy(css = "button[type='submit']")
    public WebElement processOrderBtn;
    


}
