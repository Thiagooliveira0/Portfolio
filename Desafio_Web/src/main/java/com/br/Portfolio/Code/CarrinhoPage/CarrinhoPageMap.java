package com.br.Portfolio.Code.CarrinhoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarrinhoPageMap {

	protected static String emptyCart = "Your shopping cart is empty";

	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[2]/label")
	protected static WebElement txtNomeProdCarrinho;

	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[6]/p")
	protected static WebElement txtValorProdCarrinho;

	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[5]/label[2]")
	protected static WebElement lblQuantProdCart;

	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[6]/span/a[3]")
	protected static WebElement lnkRemoveItemCart;

	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[6]/span/a[1]")
	protected static WebElement lnkEditProductCart;

	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/div/label")
	protected static WebElement txtCartMessage;

	protected static void CategoriaProductPage(WebDriver driver) {
		PageFactory.initElements(driver, CarrinhoPageMap.class);
	}
}
