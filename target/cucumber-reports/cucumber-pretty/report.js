$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to create credentials",
  "description": "",
  "id": "as-a-user,-i-want-to-create-credentials",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Successful login using valid account",
  "description": "",
  "id": "as-a-user,-i-want-to-create-credentials;successful-login-using-valid-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ValidCase"
    },
    {
      "line": 3,
      "name": "@SomeTags"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is in testapp Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter \u003cuserName\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on Second Login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Success login to home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "as-a-user,-i-want-to-create-credentials;successful-login-using-valid-account;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 12,
      "id": "as-a-user,-i-want-to-create-credentials;successful-login-using-valid-account;;1"
    },
    {
      "cells": [
        "testuser@example.com",
        "test123"
      ],
      "line": 13,
      "id": "as-a-user,-i-want-to-create-credentials;successful-login-using-valid-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13522983900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Successful login using valid account",
  "description": "",
  "id": "as-a-user,-i-want-to-create-credentials;successful-login-using-valid-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SomeTags"
    },
    {
      "line": 3,
      "name": "@ValidCase"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is in testapp Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter testuser@example.com and test123",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on Second Login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Success login to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginPage()"
});
formatter.result({
  "duration": 578799400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickOnLogin()"
});
formatter.result({
  "duration": 169742300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser@example.com",
      "offset": 11
    },
    {
      "val": "test123",
      "offset": 36
    }
  ],
  "location": "LoginSteps.loginPage(String,String)"
});
formatter.result({
  "duration": 550145400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickOnLoginSecond()"
});
formatter.result({
  "duration": 164428100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.successLogin()"
});
formatter.result({
  "duration": 108820800,
  "status": "passed"
});
formatter.after({
  "duration": 1264819200,
  "status": "passed"
});
});