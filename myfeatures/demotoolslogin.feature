Feature: My validation on Mercury Tours
Scenario: Login on Mercury Tours
Given User has launched the application
Then User enters the valid credentials
And User clicks on submit button
Then User Verifies the login status

Scenario: Guest User registration in Mercury Tours
Given User Launched the app of mercury tours
Then User clicks on signUp link
When User enters the valid data in the form
And User clicks on submit button available
Then User Verifies the registration status
