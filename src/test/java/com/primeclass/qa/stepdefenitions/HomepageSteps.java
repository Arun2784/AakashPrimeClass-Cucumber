package com.primeclass.qa.stepdefenitions;

import com.primeclass.qa.base.TestBase;
import com.primeclass.qa.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class HomepageSteps extends TestBase {

	TestBase testBase;
	HomePage homePage;

	@Given("user opens browsers")
	public void user_opens_browsers() {
		testBase = new TestBase();// this is must create and intialize the object a before calling the the class
									// method.
		testBase.initialaztion();

		// Make initialaztion method static if want to directly access by class name
	}

	@Then("Verify user is on homepage if Aakash prime logo and contact us number visible.")
	public void user_is_on_homepage() {
		homePage = new HomePage();
		String title = homePage.getHomePageTitle();

		System.out.println("HomePage Title is----->" + title);
		//Assert.assertEquals(title, prop.getProperty("HomePageTitle"), "title is not correct");

		boolean flag = homePage.validationPrimeLogo();

		Assert.assertTrue(flag);

		String contactusnum = homePage.verifycontactus();
		System.out.println("Aakash Prime home Contact number is---->" + contactusnum);
		Assert.assertEquals(contactusnum, prop.getProperty("contactUs"), "contact us number is wrong here");

	}

	@When("user first click on login icon")
	public void user_first_click_on_login_icon() {

	}

	@Then("user reach on login page")
	public void user_reach_on_login_page() {

	}

	@Then("user now enter the Id and password")
	public void user_now_enter_the_Id_and_password() {

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

	}

}
