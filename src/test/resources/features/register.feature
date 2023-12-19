Feature: Login Test
  As user I want to login into nop commerce website
  @Sanity,@Regression
  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
  Given I am on homepage
When I Click on Register Link
Then I can see the  "Register" text
@smoke@Regression
Scenario Outline: verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
  Given I am on homepage
When I Click on Register Link
And I Click on "REGISTER" button
Examples:
 | fieldName       | errorMessage            |
 | FirstName       | First name is required. |
  | LastName        | Last name is required.  |
  | Email           | Email is required.      |
  | Password        | Password is required.   |
  | ConfirmPassword | Password is required.   |
@Regression
Scenario Outline: verifyThatUserShouldCreateAccountSuccessfully
  Given I am on homepage
When I Click on Register Link
And I Select gender "Female"
And I Enter firstname
And I Enter lastname
And I Select day
And I Select month
And I Select year
And I Enter email
And I Enter password
And I Enter Confirm Password
And I Click on "REGISTER" button
Then I can see Verify message "Your registration completed"
Examples:
  | gender | firstName | lastName | day | month    | year | password | confirmPassword |
  | Female | Anna      | Smith    | 10  | october  | 1990 | abc123   | abc123          |

