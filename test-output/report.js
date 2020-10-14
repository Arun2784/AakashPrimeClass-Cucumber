$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:primeclass_home.feature");
formatter.feature({
  "name": "Aakash Prime class feature Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the Login page Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageSteps.user_is_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user first click on login icon",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageSteps.user_first_click_on_login_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user reach on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.user_reach_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user now enter the Id and password",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.user_now_enter_the_Id_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSteps.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
});