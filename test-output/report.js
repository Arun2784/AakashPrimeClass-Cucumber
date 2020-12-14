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
  "name": "user opens browsers",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageSteps.user_opens_browsers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is on homepage if Aakash prime logo and contact us number visible.",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.user_is_on_homepage()"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //a[contains(text(),\u0027+91-7428232929\u0027]) because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//a[contains(text(),\u0027+91-7428232929\u0027])\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d86.0.4240.183)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#invalid_selector_exception\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027CORPLPTP000053\u0027, ip: \u0027172.16.21.94\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.183, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\010645~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58688}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 8f56b3e41c874eeb5957fdd49e1f4c8b\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027+91-7428232929\u0027])}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:394)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\r\n\tat com.primeclass.qa.pages.HomePage.verifycontactus(HomePage.java:38)\r\n\tat com.primeclass.qa.stepdefenitions.HomepageSteps.user_is_on_homepage(HomepageSteps.java:38)\r\n\tat ✽.Verify user is on homepage if Aakash prime logo and contact us number visible.(file:primeclass_home.feature:6)\r\n",
  "status": "failed"
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