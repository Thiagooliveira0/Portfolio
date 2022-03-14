package com.br.Portfolio.Code.CarrinhoPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CarrinhoSteps {

	CarrinhoLogic carrinho = new CarrinhoLogic();

	@And("clico para excluir o produto do carrinho")
	public void clico_em_Excluir_Produto_do_Carrinho() throws Exception {
		carrinho.clicoParaExcluirProduto();
	}

	@And("clico no botao para editar o produto")
	public void clico_em_Editar_Produto_do_Carrinho() throws Exception {
		carrinho.clicoParaEditarProduto();
	}

	@Then("Valido se o produto esta no carrinho")
	public void valido_se_Produto_esta_Constando_no_Carrinho() throws Exception {
		carrinho.validoItemCarrinho();
	}

	@Then("Valido se preco esta correto")
	public void valido_preco_do_Produo_no_Carrinho() throws Exception {
		carrinho.validoValordoItemCarrinho();
	}

	@Then("valido se alteracao foi efetuada")
	public void valido_Alteracao_da_Quantidade_no_Carrinho() throws Exception {
		carrinho.validoAlteracaonaQuantidadedoProduto();
	}

	@Then("valido se o produto foi excluido do carrinho")
	public void valido_se_Produto_foi_Excluido_do_Carrinho() throws Exception {
		carrinho.validoSeItemfoiExcluido();
	}

}