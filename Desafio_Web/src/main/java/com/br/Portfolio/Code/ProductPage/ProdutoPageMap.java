package com.br.Portfolio.Code.ProductPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutoPageMap {

	@FindBy(xpath = "//*[@id=\"Description\"]/h1")
	protected static WebElement lblNomeProduto;

	@FindBy(xpath = "//*[@id=\"Description\"]/h2")
	protected static WebElement lblValorProduto;

	@FindBy(xpath = "//*[@id=\"Description\"]/p")
	protected static WebElement lblDescicaoProduto;

	@FindBy(name = "save_to_cart")
	protected static WebElement btnAdicionaraoCarrinho;

	@FindBy(xpath = "//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[3]")
	protected static WebElement btnIncrementQuant;

	@FindBy(xpath = "//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[2]")
	protected static WebElement lblQuantProduct;

	@FindBy(xpath = "//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[1]")
	protected static WebElement btnDecrementQuant;

	protected static void productPage(WebDriver driver) {
		PageFactory.initElements(driver, ProdutoPageMap.class);
	}
}