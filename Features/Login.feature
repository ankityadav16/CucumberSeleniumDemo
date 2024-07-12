Feature: SauceDemo Login

  # Scenario for a normal login with valid credentials
  Scenario: Normal login with valid credentials
    Given User navigates to the SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the login button
    Then User should be logged in successfully

  # Scenario Outline for login with different credentials
  Scenario Outline: Login with different credentials
    Given User navigates to the SauceDemo login page
    When User enters username "<username>" and password "<password>"
    And User clicks on the login button
    Then User should see "<expectedOutcome>"

    # Example table providing different sets of usernames, passwords, and expected outcomes
    Examples:
      | username       | password     | expectedOutcome           |
      | standard_user  | secret_sauce | logged in successfully    |
      | locked_out_user| secret_sauce | an error message          |
      | problem_user   | secret_sauce | logged in successfully    |
      | invalid_user   | invalid_pass | an error message          |
