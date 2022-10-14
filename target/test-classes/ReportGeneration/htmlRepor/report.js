$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20Files/LoginFunction.feature");
formatter.feature({
  "name": "To Check Login Function in Facebook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Pass Valid Username and Valid Password",
  "description": "Background:",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_Open_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Pass Username and Password",
  "rows": [
    {
      "cells": [
        "sno",
        "name",
        "id",
        "user"
      ]
    },
    {
      "cells": [
        "1",
        "kavi",
        "123",
        "apple"
      ]
    },
    {
      "cells": [
        "2",
        "ravi",
        "456",
        "orange"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.to_Pass_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Close Chrome Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.to_Close_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature%20Files/createnew.feature");
formatter.feature({
  "name": "To Create new account in Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Pass all data",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_Open_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click Create New Button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "To Click Signin Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.to_Click_Signin_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});