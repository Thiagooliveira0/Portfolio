package com.br.Portfolio.Code.ProductPage;

import io.cucumber.java.en.*;

public class ProdutoSteps {

	ProdutoLogic produto = new ProdutoLogic();

	@And("clico para acrescentar uma unidade")
	public void clico_para_Acrescentar_uma_unidade_ao_Produto() throws Exception {
		produto.incrementarQuantidadeProd();
	}

	@And("clico no botao para adiconar o item ao carrinho")
	public void clico_no_Botao_AddtoCart_na_Tela_do_Produto() throws Exception {
		produto.adicionarProdutaoaoCarringo();
	}

	@Then("valido o campo titulo")
	public void valido_Titulo_do_Produto_identico_ao_Produto_Selecionado() throws Exception {
		produto.verificoTituloProduto();
	}

	@Then("valido o campo preco")
	public void valido_Valor_do_Produto_identico_ao_Produto_Selecionado() throws Exception {
		produto.verificoValorProduto();
	}

	@Then("valido o campo descricao do produto")
	public void valido_Descricao_do_Produto() throws Exception {
		produto.verificoDescricaoProd();
	}

}