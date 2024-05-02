Feature: Sign Up user

  Background:
    Given I am accessed to the Luma home page

  @SignUp
  Scenario Outline: Sign up user page
    When click to Create new user
    And I fill all mandatory fields "<first_name>", "<last_name>", "<email>", "<password>"
    And I click to the create an account button
    Then I see the new user created

    Examples:
      | first_name   | last_name   | email                | password    |
      | FirstName_T1 | LastName_T1 | emailtest123456771@gmail.com | P@ssw0rd123 |
