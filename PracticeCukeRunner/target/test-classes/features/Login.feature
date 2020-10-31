Feature: Login feature
  CBT-25(Jira Ticket): As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.

  Scenario: Librarian login scenario
    When user logs in as librarian
    Then user should see dashboard


    Scenario: Student login scenario
      When User logs in as student
      Then User should see dashboard


      Scenario: Admin login scenario
        When User logs in as admin
        Then User should see dashboard
