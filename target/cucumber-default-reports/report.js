$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "nagivate OrangeHrm login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.LoginStepDefinitions.nagivate_OrangeHrm_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.LoginStepDefinitions.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.LoginStepDefinitions.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.LoginStepDefinitions.quit_the_browser()"
});
formatter.result({
  "status": "passed"
});
});