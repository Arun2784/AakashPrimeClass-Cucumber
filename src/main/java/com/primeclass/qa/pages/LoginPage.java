package com.primeclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.primeclass.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[contains(text(),'CENTRES')]")

	WebElement centerButton;

	@FindBy(xpath = "//div[@id='block-prime-class-branding']//a//img")

	WebElement PrimeLogo;

	@FindBy(xpath = "//a[contains(text(),'Aakash Distance Learning')]")

	WebElement homePageHeader;

	@FindBy(xpath = "//a[contains(text(),'+91-7428232929')]")

	WebElement contactUsnumber;

	@FindBy(xpath = "//nav[@id='block-useraccountmenu-4']")

	WebElement loginicon;

	@FindBy(xpath = "//a[contains(text(),'Log In')]")

	WebElement clickonLogIn;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")

	WebElement SignUp;

	public LoginPage() {

		// PageFactory.initElements(driver, this);

		PageFactory.initElements(driver, this);

	}

	public String getLoginPageTitle() {

		return driver.getTitle();

	}

	public boolean buttonValidation() {

		return centerButton.isEnabled();

	}

	public String getHomepageTextValue() {

		return homePageHeader.getText();

	}

	public String contactUsPhonValidation() {

		return contactUsnumber.getText();

	}

	public void clickonloginIcons() throws InterruptedException {

		loginicon.click();
		Thread.sleep(2000);
		SignUp.click();
	}

}
