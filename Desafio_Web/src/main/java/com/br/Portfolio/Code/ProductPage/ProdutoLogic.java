package com.br.Portfolio.Code.ProductPage;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import com.br.Portfolio.Code.CategoriaProdutosPage.CategoriaProdutosLogic;
import com.br.Portfolio.Code.Chrome.ChromeLogic;
import com.br.Portfolio.Code.Utils.Utils;

public class ProdutoLogic extends ProdutoPageMap {

	public static String nameProd;
	public static String valorProd;
	public static String quantProd;

	public void verificoTituloProduto() throws Exception {
		String step = "Verifico titulo do produto";
		productPage(ChromeLogic.navegador);
		Utils.scrollToElement(btnAdicionaraoCarrinho);
		assertEquals(lblNomeProduto.getText().toLowerCase(), CategoriaProdutosLogic.nameProdCard.toLowerCase());
		Utils.tirarPrint(step);
	}

	public void verificoValorProduto() throws Exception {
		String step = "Verifico valor do produto";
		assertEquals(lblValorProduto.getText(), CategoriaProdutosLogic.valueProdCard);
		Utils.tirarPrint(step);
	}

	public void verificoDescricaoProd() throws Exception {
		String step = "verifico descricao do produto";
		assertTrue(lblDescicaoProduto.isDisplayed());
		Utils.tirarPrint(step);
	}

	public void incrementarQuantidadeProd() throws Exception {
		String step = "incremento quantidade do produto";
		Utils.tirarPrint(step);
		btnIncrementQuant.click();
	}

	public void adicionarProdutaoaoCarringo() throws Exception {
		String step = "Adiciono produto ao carrinho";
		productPage(ChromeLogic.navegador);
		nameProd = lblNomeProduto.getText();
		valorProd = lblValorProduto.getText();
		Utils.tirarPrint(step);
		btnAdicionaraoCarrinho.click();
	}

}