$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Rx2u.feature");
formatter.feature({
  "line": 1,
  "name": "RX2U",
  "description": "",
  "id": "rx2u",
  "keyword": "Feature"
});
formatter.before({
  "duration": 121904071,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "Go to Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I go to Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Rx2u_imp.i_go_to_Homepage()"
});
formatter.result({
  "duration": 5576124536,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validate logo",
  "description": "",
  "id": "rx2u;validate-logo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@logo"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I validate the logo as \"Rx2U\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Rx2U",
      "offset": 24
    }
  ],
  "location": "Rx2u_imp.i_validate_the_logo_as(String)"
});
formatter.result({
  "duration": 37193582,
  "status": "passed"
});
formatter.after({
  "duration": 603133,
  "status": "passed"
});
formatter.before({
  "duration": 137145,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "Go to Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I go to Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Rx2u_imp.i_go_to_Homepage()"
});
formatter.result({
  "duration": 5089664913,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validate About",
  "description": "",
  "id": "rx2u;validate-about",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@about"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I validate About",
  "keyword": "Then "
});
formatter.match({
  "location": "Rx2u_imp.i_validate_About()"
});
formatter.result({
  "duration": 3322009700,
  "status": "passed"
});
formatter.after({
  "duration": 226131,
  "status": "passed"
});
});