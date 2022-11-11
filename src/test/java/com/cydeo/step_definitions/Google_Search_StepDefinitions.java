package com.cydeo.step_definitions;

import com.cydeo.pages.google_search_page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_Search_StepDefinitions {

    google_search_page google_search_page = new google_search_page();


    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("User types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        google_search_page.searchBox.sendKeys("apple " + Keys.ENTER);
    }
    @Then("User sees apple – Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }


    @When("User types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String arg0) {
        google_search_page.searchBox.sendKeys("tesla " + Keys.ENTER);
    }

    /*@Then("User sees {string} – Google Search is in the google title")
    public void userSeesGoogleSearchIsInTheGoogleTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

     */

    @Then("User sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
