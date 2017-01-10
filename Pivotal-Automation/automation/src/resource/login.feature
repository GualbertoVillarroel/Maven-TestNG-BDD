Feature: Login to Pivotal Tracker web page
  As a user
  I want to login to Pivotal Tracker page with valid credentials
  so I should login successfully

  Scenario: Login to Pivotal Tracker using valid credentials
    Given I am on Pivotal Tracker home page
    When I put a valid user gualy_vc@hotmail.com
    And I put a valid password password123
    Then I should login to https://www.pivotaltracker.com/dashboard