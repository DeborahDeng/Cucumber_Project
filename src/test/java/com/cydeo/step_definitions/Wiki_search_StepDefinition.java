package com.cydeo.step_definitions;

import com.cydeo.pages.wiki_search_page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_search_StepDefinition {
    wiki_search_page wiki_search_page = new wiki_search_page();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");


    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wiki_search_page.searchBox.sendKeys("Steve Jobs");

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wiki_search_page.searchButton.click();

    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {

        /*
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Steve Jobs" ;
        Assert.assertEquals(expectedTitle, actualTitle);

         */

        Assert.assertTrue("Title verification is failed ",Driver.getDriver().getTitle().contains("Steve Jobs"));

    }

}
