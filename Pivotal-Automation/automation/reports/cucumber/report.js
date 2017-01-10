$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/resource/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Pivotal Tracker web page",
  "description": "As a user\r\nI want to login to Pivotal Tracker page with valid credentials\r\nso I should login successfully",
  "id": "login-to-pivotal-tracker-web-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Login to Pivotal Tracker using valid credentials",
  "description": "",
  "id": "login-to-pivotal-tracker-web-page;login-to-pivotal-tracker-using-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on Pivotal Tracker home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I put a valid user gualy_vc@hotmail.com",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I put a valid password password123",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should login to https://www.pivotaltracker.com/dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.givenIAmOnPivotalTrackerHomePage()"
});
formatter.result({
  "duration": 7459094000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gualy_vc@hotmail.com",
      "offset": 19
    }
  ],
  "location": "LoginSteps.whenIPutAValidUser(String)"
});
formatter.result({
  "duration": 3537199400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password123",
      "offset": 23
    }
  ],
  "location": "LoginSteps.whenIPutAValidPassword(String)"
});
formatter.result({
  "duration": 3568317700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.pivotaltracker.com/dashboard",
      "offset": 18
    }
  ],
  "location": "LoginSteps.thenIShouldLoginTo(String)"
});
formatter.result({
  "duration": 7547600,
  "status": "passed"
});
});