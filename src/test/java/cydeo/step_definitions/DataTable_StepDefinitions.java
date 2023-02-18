package cydeo.step_definitions;

import cydeo.pages.*;
import cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.junit.*;

import java.util.*;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        //This method will return us the List of String of given dropdown's options
        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);

        Assert.assertEquals(expectedMonths, actualMonths);
        //Assert will check the size of the lists first. If it is matching it will check content 1 by 1.

    }




}
