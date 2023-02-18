package cydeo.pages;

import cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class ViewAllOrdersPage extends BasePage{

    public ViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //we need to locate the first cell of the first row
    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;



}
