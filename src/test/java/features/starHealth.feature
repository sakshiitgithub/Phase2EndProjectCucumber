Feature: Phase End Project

Background:
Given User Open the chrome browser and starhealth application

@training
Scenario: Starhealth HomePage test
Then  validates the Star Health home page title using a JUnit assertion 
Then  clicks on the Buy Now button
And User enters following details
| FullName | PhNo | PIN |
| Sakshi | 8114489203 | 53564 |
And Close the browser

@simplilearn
Scenario: Plan Page
Then  User click on the Plan for My Family page 
And Validate the user mobile number
And User clicks on the Star Health logo
And Close the browser
