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
Feature: Login functionality for saucedemo
Scenario: To check  Login functionality for saucedemo
Scenario Outline: To check  the login with data driven passing for saucedemo
Given Url is running

When user enter valid username <username>
And valid password <pass>

Then User should be able to login

Examples:
|username               |pass         |
|standard_user          |secret_sauce |
|locked_out_user        |secret_sauce |
|problem_user           |secret_sauce |
|performance_glitch_user|secret_sauce |
