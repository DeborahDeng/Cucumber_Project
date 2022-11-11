Feature: TC#1: Google Search Functionality Title Verification
  User story: A user, I should be able to google search a page

    Scenario: As a user verify the google functionalities.
    Given  User is on Google search page
    When User types apple in the google search box and clicks enter
    Then User sees apple – Google Search is in the google title

@
 Scenario: As a user verify the google functionalities.
  Given  User is on Google search page
  When User types "tesla" in the google search box and clicks enter
  Then User sees "tesla - Google Search" is in the google title

