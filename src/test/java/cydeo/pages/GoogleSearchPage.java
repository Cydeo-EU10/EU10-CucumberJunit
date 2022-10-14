package cydeo.pages;

import cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class GoogleSearchPage {

    //create constructor
    // initialize the driver instance and this class' instance using PageFactory.initElements
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //We can start locating web elements using @FindBy annotation
    @FindBy(name = "q")
    public WebElement searchBox;

//    public WebElement capitalElement(String capital){
//        return Driver.getDriver().findElement(By.linkText(capital));
//    }

    public String getCapital(){
        return Driver.getDriver().findElement(By.xpath("//a[@class='FLP8od']")).getText();
    }

}
