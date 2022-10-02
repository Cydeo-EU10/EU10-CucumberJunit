package cydeo.pages;

import cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DropdownsPage {

    public DropdownsPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
    }

    @FindBy(id = "month")
    public WebElement monthDropdown;

}
