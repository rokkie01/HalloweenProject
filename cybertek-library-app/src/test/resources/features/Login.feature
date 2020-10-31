Feature: Login as a user, I should be able to login

  Background: Backstory is that user on the login page
    Given I am on the login page

  Scenario: Login as a librarian
    When I login as a librarian
    Then dashboard should be displayed

  Scenario: Login as a student
    When I login as a student
    Then dashboard should be displayed