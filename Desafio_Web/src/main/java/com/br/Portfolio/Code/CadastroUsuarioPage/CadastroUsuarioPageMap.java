package com.br.Portfolio.Code.CadastroUsuarioPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroUsuarioPageMap {
	
	@FindBy(name = "usernameRegisterPage")
	protected static WebElement lblUserName;
	
	@FindBy(name = "emailRegisterPage")
	protected static WebElement lblEmail;
	
	@FindBy(name = "passwordRegisterPage")
	protected static WebElement lblPassword;
	
	@FindBy(name = "confirm_passwordRegisterPage")
	protected static WebElement lblConfirmPassword;
	
	@FindBy(name = "first_nameRegisterPage")
	protected static WebElement lblFirstName;
	
	@FindBy(name = "last_nameRegisterPage")
	protected static WebElement lblLastName;
	
	@FindBy(name = "phone_numberRegisterPage")
	protected static WebElement lblPhoneNumber;
	
	@FindBy(name = "countryListboxRegisterPage")
	protected static WebElement lstContry;
	
	@FindBy(name = "cityRegisterPage")
	protected static WebElement lblCity;
	
	@FindBy(name = "addressRegisterPage")
	protected static WebElement lblAdress;
	
	@FindBy(name = "state_/_province_/_regionRegisterPage")
	protected static WebElement lblState;
	
	@FindBy(name = "postal_codeRegisterPage")
	protected static WebElement lblPostalCode;
	
	@FindBy(name = "i_agree")
	protected static WebElement chkAgreeConditions;
	
	@FindBy(id = "register_btnundefined")
	protected static WebElement btnRegister;
	
	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/label")
	protected static WebElement txtUserNameErrorMessage;
	
	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/label")
	protected static WebElement txtEmailErrorMessage;
	
	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label")
	protected static WebElement txtPasswordErrorMessage;
	
	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/label")
	protected static WebElement txtConfirmPasswordErrorMessage;

	protected static void CadastroClientePage(WebDriver driver) {
		PageFactory.initElements(driver, CadastroUsuarioPageMap.class);	
	}
}
