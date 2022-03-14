package com.br.Portfolio.Code.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMap {
	protected static final String messageInvalidUser = "Incorrect user name or password.";
	protected static final String messageBlockedUser = "User is temporary blocked from login";

	@FindBy(linkText = "CREATE NEW ACCOUNT")
	protected static WebElement lnkNewAccount;

	@FindBy(name = "username")
	protected static WebElement lblUsername;

	@FindBy(name = "password")
	protected static WebElement lblPassword;

	@FindBy(id = "sign_in_btnundefined")
	protected static WebElement btnSignIn;

	@FindBy(linkText = "SIGN IN WITH FACEBOOK")
	protected static WebElement btnSigninFacebook;

	@FindBy(id = "signInResultMessage")
	protected static WebElement txtInvalidUserorPassword;

	protected static void LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, LoginPageMap.class);
	}
}
