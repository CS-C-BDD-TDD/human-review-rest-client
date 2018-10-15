@Login
Feature: Login YellowDog application
	As an analyst I need to be able to enter my credentials and
	sign in the YellowDog application in order to perform human reviews.

@Kiet_WIP
Scenario: Get token when given valid credential
	Given I am have a valid credential as "User1" and "Pass1" for Human Review backend
    When I invoke user authentication
    Then I should get a valid access token.
   
    