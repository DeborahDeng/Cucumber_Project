@smoke
Feature: Library app feature
  user Story:
  As a user, I should be able to login with the correct credentials to different accounts
  and dashboard should be displayed.

  Accounts are: Librarian, student, admin

  @smoke
  Scenario: Login as a Librarian
    Given user is on the Library Login page
    When user enters Librarian dashboard
    And user enters Librarian password
    Then user should see the dashboard

  @smoke
Scenario: login as student
  Given user is on the student login page
  When user enters the student login page
  And user enters the student login page
  Then user shoulder be see the dashboard

  @smoke
  Scenario: login as Admin
    Given user is on the admin login page
    When user enters the admin login page
    And user enters the admin login page
    Then user shoulder be see the dashboard
