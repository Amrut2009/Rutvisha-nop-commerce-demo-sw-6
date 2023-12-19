  Feature: Login Feature
    As user I want to login into nop-commerce website
@Sanity,@Regression
  Scenario: :userShouldNavigateToLoginPageSuccessFully.
    Given I am on homepage
  When  I click on login link
  Then I should navigate to login page successfully

@Smoke,@Regression
 Scenario: :verifyTheErrorMessageWithInValidCredentials.
    Given I am on homepage
  When I click on login link
 Then I Enter EmailId
  And I Enter Password
  And  I Click on Login Button
  Then I can see the  Error message

@Regression
 Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
   Given I am on homepage
  When I  Click on login link
   And I Enter EmailId "primeeight@gmail.com"
  And I Enter Password "abc123"
  And I Click on Login Button
  Then  I should login successfully "My account"
@Regression
 Scenario: VerifyThatUserShouldLogOutSuccessFully
    Given I am on homepage
  When  I Click on login link
    And I Enter EmailId "primeeight@gmail.com"
    And I Enter Password "abc123"
    And I Click on Login Button
  And  I Click on LogOut Link
  Then I can see that LogIn Link Display