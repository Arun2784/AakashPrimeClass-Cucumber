package com.primeclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.primeclass.qa.base.TestBase;

public class HomePage extends TestBase {

	// PageFactory or object repositry

	@FindBy(xpath = "//div[@id='block-prime-class-branding']")

	WebElement HomePageLogo;

	@FindBy(xpath = "//a[contains(text(),'+91-7428232929'])")

	WebElement ContactUsLink;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public String getHomePageTitle() {

		return driver.getTitle();

	}

	public boolean validationPrimeLogo() {

		return HomePageLogo.isDisplayed();
	}

	public String verifycontactus() {
		return ContactUsLink.getText();

	}
}
