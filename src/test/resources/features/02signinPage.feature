Feature: validating signin page
​
Scenario: user logins with correct credentials
Given User is in homepage
Then user clicks signin and redirects to signin page 
When user enters username as "starninja" password as "Welcome@11"
And user clicks login button and redirects to home page

Scenario Outline: User on login page and login with invalid inputs "<username>" and "<password>"
    Given The user is on signin page
    When The user enter invalid "<username>" and "<password>"
    Then click login button to verify

    Examples: 
      | username | password  |
      |   admin |        |
     
      |starninja | Welcome@11|