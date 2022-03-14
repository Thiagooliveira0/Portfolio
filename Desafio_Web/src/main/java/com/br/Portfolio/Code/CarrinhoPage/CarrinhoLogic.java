package com.br.Portfolio.Code.CarrinhoPage;

import static org.testng.Assert.assertEquals;
import com.br.Portfolio.Code.Chrome.ChromeLogic;
import com.br.Portfolio.Code.ProductPage.ProdutoLogic;
import com.br.Portfolio.Code.Utils.Utils;

public class CarrinhoLogic extends CarrinhoPageMap {

	public void validoItemCarrinho() throws Exception {
		String step = "Valido item no carrinho";

		CategoriaProductPage(ChromeLogic.navegador);
		assertEquals(txtNomeProdCarrinho.getText(), ProdutoLogic.nameProd);
		Utils.tirarPrint(step);
	}

	public void validoValordoItemCarrinho() throws Exception {
		String step = "Valido valor do Item no Carrinho";
		String valorProd = ProdutoLogic.valorProd;
		assertEquals(txtValorProdCarrinho.getText(), valorProd);
		Utils.tirarPrint(step);
	}

	public void clicoParaExcluirProduto() throws Exception {
		String step = "Clico para excluir produto do Carrinho";
		Utils.tirarPrint(step);
		lnkRemoveItemCart.click();
	}

	public void clicoParaEditarProduto() throws Exception {
		String step = "Clico para editar item no carrinho";

		Utils.tirarPrint(step);
		lnkEditProductCart.click();
	}

	public void validoAlteracaonaQuantidadedoProduto() throws Exception {
		String step = "Valido alteracao na quantidade do Produto no carrinho";
		String quantExpected = "2";
		assertEquals(lblQuantProdCart.getText(), quantExpected);
		Utils.tirarPrint(step);
	}

	public void validoSeItemfoiExcluido() throws Exception {
		String step = "Valido se Item foi Excluido";
		assertEquals(txtCartMessage.getText(), emptyCart);
		Utils.tirarPrint(step);
	}
}