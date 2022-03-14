package com.br.Portfolio.Code.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMap {
	
	@FindBy(id = "menuUser")
	protected static WebElement btnMenuUsuario;
	
	@FindBy(xpath = "//*[@id=\"menuUserLink\"]/span")
	protected static WebElement lblUserLogado;

	@FindBy(xpath = "//*[@id=\"loginMiniTitle\"]/label[3]")
	protected static WebElement lnkSignOut;
	
	@FindBy(id = "headphonesImg")
	protected static WebElement cardHeadPhones;
	
	@FindBy(id = "searchSection")
	protected static WebElement iconBuscaProd;
	
	@FindBy(id = "autoComplete")
	protected static WebElement lblInformarProdutoTelaGrande;
	
	@FindBy(name = "mobile_search")
	protected static WebElement lblInformarProdutoTelaPequena;
	
	@FindBy(id = "shoppingCartLink")
	protected static WebElement btnCarrinho;
	
	protected static void HomePage(WebDriver driver) {
		PageFactory.initElements(driver, HomePageMap.class);
	}
	
}
