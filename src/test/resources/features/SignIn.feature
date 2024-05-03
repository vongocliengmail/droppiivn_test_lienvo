Feature: Sign Up user

  Background:
    Given I am accessed to the Luma home page

  @SignIn
  Scenario : Sign In user page
    When click to Sign In link
    And I enter the valid email and password
    And I click to the Sign in button
    Then I see the user logged sucessfully

