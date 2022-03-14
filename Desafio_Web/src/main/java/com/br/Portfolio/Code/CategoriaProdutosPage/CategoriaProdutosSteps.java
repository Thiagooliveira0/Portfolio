package com.br.Portfolio.Code.CategoriaProdutosPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CategoriaProdutosSteps {

	CategoriaProdutosLogic categoriaProdutos = new CategoriaProdutosLogic();

	@And("seleciono o primeiro produto")
	public void seleciono_o_Primeiro_Produto_da_Lista() throws Exception {
		categoriaProdutos.seleciono_Primeiro_Produto_da_Lista();
	}

	@Then("valido se produtos exibidos contem o texto informado {string}")
	public void valido_se_Produtos_Exibidos_Contem_o_Texto_da_Busca(String product) throws Exception {
		categoriaProdutos.valido_Produtos_Exibidos_Contem_Texto_da_Busca(product);
	}

}