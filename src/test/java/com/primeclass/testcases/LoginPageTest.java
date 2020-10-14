package com.primeclass.testcases;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import com.primeclass.qa.base.TestBase;
import com.primeclass.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;

	public LoginPageTest() {

		super();

	}

	@BeforeMethod

	public void setup() {

		initialaztion();

		loginpage = new LoginPage();
	}

	@Test

	public void verifyLoginPageTitleTest() {

	}

}
