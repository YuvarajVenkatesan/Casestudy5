$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:logingin/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  I want to login to testme",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I want login",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter username \"\u003cuname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I enter my password \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "When "
});
formatter.step({
  "name": "I should be in homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "uname",
        "pass"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "Password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I want login",
  "keyword": "Given "
});
formatter.match({
  "location": "login.i_want_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username \"Lalitha\"",
  "keyword": "When "
});
formatter.match({
  "location": "login.i_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my password \"Password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.i_enter_my_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "login.i_should_be_in_homepage()"
});
formatter.result({
  "status": "passed"
});
});