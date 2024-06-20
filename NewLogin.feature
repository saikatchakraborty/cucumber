		#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Loginfunctionality
Feature: Login functionality
@Withoutparameter
Scenario: To check  the login with user data

Given Url is running

When user enter valid username
And valid password

Then User should be able to login
@Withparameter
Scenario: To check  the login with parameters data

Given Url is running

When user enter valid username "saikatchakraborty"
And valid password "Test@123"

Then User should be able to login

Scenario Outline: To check  the login with data driven passing
Given Url is running

When user enter valid username <username>
And valid password <pass>

Then User should be able to login

Examples:
|username|pass    |
|Ruhi    |Ruhi123 |
|priya   |priya213|
|tusar   |tusar123|
|rutu    |tutu123 |


