package com.br.Portfolio.Code.CategoriaProdutosPage;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.br.Portfolio.Code.Chrome.ChromeLogic;


public class CategoriaProdutosPageMap {

	@FindBy(xpath = "/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]")
	protected static  WebElement lstfirstProduct;

	@FindBy(xpath = "//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li[1]")
	protected static WebElement lslFirstProdSearch;

	@FindBy(xpath = "/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]/p[1]/a")
	protected static WebElement txtFirstProdName;

	@FindBy(xpath = "/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]/p[2]/a")
	protected static WebElement txtFirstProdValue;

	public void validarProdutosListados(String search) {
		boolean continuar = true;
		int possition = 1;

		while (continuar) {

			try {
				String element = ChromeLogic.navegador
						.findElement(By
								.xpath("//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li[" + possition + "]/p[1]/a"))
						.getText();
				if (!element.toLowerCase().contains(search.toLowerCase())) {

					continuar = false;
					fail("Produto: " + element + " nao contem valor da busca: " + search);
				}
			} catch (NoSuchElementException e) {
				continuar = false;
			}
			possition++;
		}
	}

	protected static void CategoriaProductPage(WebDriver driver) {
		PageFactory.initElements(driver, CategoriaProdutosPageMap.class);
	}

}
