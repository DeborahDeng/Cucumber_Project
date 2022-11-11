package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {

    @Given("user is on the Library Login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("user is on the Library Login page");

    }

    @When("user enters Librarian dashboard")
    public void user_enters_librarian_dashboard() {

        System.out.println("user enters Librarian dashboard");
    }

    @When("user enters Librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters Librarian password");

    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");

    }

    @Given("user is on the student login page")
    public void user_is_on_the_student_login_page() {
        System.out.println("user is on the student login page");
    }

    @When("user enter the student login page")
    public void user_enter_the_student_login_page() {
        System.out.println("user enter the student login page");
    }

    @When("user enters the student login page")
    public void user_enters_the_student_login_page() {
        System.out.println("user enters the student login page");
    }

    @Then("user shoulder be see the dashboard")
    public void user_shoulder_be_see_the_dashboard() {
        System.out.println("user shoulder be see the dashboard");
    }

    @Given("user is on the admin login page")
    public void userIsOnTheAdminLoginPage() {
        System.out.println("user is on the admin login page");
    }

    @When("user enters the admin login page")
    public void userEntersTheAdminLoginPage() {
        System.out.println("user enters the admin login page");
    }
}
