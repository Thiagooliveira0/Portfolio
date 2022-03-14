package com.br.Portfolio.Code.HomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.Keys;
import com.br.Portfolio.Code.Chrome.ChromeLogic;
import com.br.Portfolio.Code.Utils.Utils;

public class HomePageLogic extends HomePageMap {

	public void clicar_Menu_Usuario() throws Exception {
		String step = "Clico no iconde de Menu Usuario";
		Utils.tirarPrint(step);
		HomePage(ChromeLogic.navegador);
		btnMenuUsuario.click();
	}

	public void clico_Sobre_Usuario_Logado() throws Exception {
		String step = "Clico sobre o usuario logado";

		Utils.tirarPrint(step);
		HomePage(ChromeLogic.navegador);
		lblUserLogado.click();
	}

	public void clico_Para_Deslogar() throws Exception {
		String step = "Clico para realizar o logout";

		Utils.tirarPrint(step);
		lnkSignOut.click();
	}

	public void valido_Nenhum_Usuario_Logado() throws Exception {
		String step = "valido se nao ha usuarios logados";
		HomePage(ChromeLogic.navegador);
		assertFalse(lblUserLogado.isDisplayed());
		Utils.tirarPrint(step);
	}

	public void valido_Usuario_Logado(String user) throws Exception {
		String step = "valido de ha usuario Logado";
		HomePage(ChromeLogic.navegador);
		assertEquals(lblUserLogado.getText(), user);
		Utils.tirarPrint(step);
	}

	public void valido_Usuario_Logado() throws Exception {
		String step = "valido de ha usuario Logado";
		HomePage(ChromeLogic.navegador);
		assertTrue(lblUserLogado.isDisplayed());
		Utils.tirarPrint(step);
	}

	public void clico_no_Card_Headphones() throws Exception {
		String step = "clico sobre o card de headphones";

		HomePage(ChromeLogic.navegador);
		Utils.tirarPrint(step);
		cardHeadPhones.click();
	}

	public void buscaProduto(String prod) throws Exception {
		String step = "realizo busca de produto";

		HomePage(ChromeLogic.navegador);
		if (iconBuscaProd.isDisplayed()) {
			iconBuscaProd.click();
			lblInformarProdutoTelaGrande.sendKeys(prod + Keys.ENTER);
			Utils.tirarPrint(step);
		} else {
			lblInformarProdutoTelaPequena.sendKeys(prod + Keys.ENTER);
			Utils.tirarPrint(step);
		}
	}

	public void clico_no_Icone_do_Carrinho() throws Exception {
		String step = "clico sobre o icone de carrinho";

		Utils.tirarPrint(step);
		HomePage(ChromeLogic.navegador);
		btnCarrinho.click();
	}

}
