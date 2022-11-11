package com.cydeo.step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Eating_Cucumber {

    @Given("John is hungry")
    public void john_is_hungry() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("It is from given");
    }

    @When("he eats some cucumbers")
    public void he_eats_some_cucumbers() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("It is from When");
    }

    @Then("he will be full")
    public void he_will_be_full() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("It is from Then");
    }

}
