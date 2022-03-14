package com.br.Portfolio.Code.HomePage;

import io.cucumber.java.en.*;

public class HomePageSteps {

	HomePageLogic homePage = new HomePageLogic();

	@And("clico no icone do menu usuario")
	public void clico_no_Icone_de_Menu_Usuario() throws Exception {
		homePage.clicar_Menu_Usuario();
	}

	@And("clico sobre a conta logada")
	public void clico_Sobre_Usuario_Logado() throws Exception {
		homePage.clico_Sobre_Usuario_Logado();
	}

	@And("clico em SignOut")
	public void clico_Para_Realizar_Logout() throws Exception {
		homePage.clico_Para_Deslogar();
	}

	@And("clico no card de headPhones")
	public void clico_no_Card_de_HeadPhone() throws Exception {
		homePage.clico_no_Card_Headphones();
	}

	@And("informo produto a ser procurado {string}")
	public void informo_Produto_a_ser_Procurado(String produto) throws Exception {
		homePage.buscaProduto(produto);
	}

	@And("clico no icone do carrinho")
	public void clico_no_Icone_de_Carrinho() throws Exception {
		homePage.clico_no_Icone_do_Carrinho();
	}

	@Then("Valido se a conta foi deslogada")
	public void valido_Nenhuma_Conta_Logada() throws Exception {
		homePage.valido_Nenhum_Usuario_Logado();
	}
	
	@Then("valido usuario logado")
	public void valido_se_ha_Usuario_Logado() throws Exception {
		homePage.valido_Usuario_Logado();
	}

}
