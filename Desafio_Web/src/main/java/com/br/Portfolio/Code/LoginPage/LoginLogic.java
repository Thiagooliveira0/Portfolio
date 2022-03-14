package com.br.Portfolio.Code.LoginPage;

import static org.testng.Assert.assertEquals;
import com.br.Portfolio.Code.Chrome.ChromeLogic;
import com.br.Portfolio.Code.Utils.Utils;

public class LoginLogic extends LoginPageMap {

	public void clicarParaCadastrarNovoUsuario() throws Exception {
		String step = "Clico no botao para realizar novo cadastro";
		LoginPage(ChromeLogic.navegador);
		Utils.tirarPrint(step);
		lnkNewAccount.click();
	}

	public void informoUsuarionaTeladeLogin(String username) throws Exception {
		String step = "Informo username na tela de login";
		LoginPage(ChromeLogic.navegador);
		lblUsername.sendKeys(username);
		Utils.tirarPrint(step);
	}

	public void informo_Senha_Usuario_Tela_de_Login(String password) throws Exception {
		String step = "Informo senha na tela de login";
		lblPassword.sendKeys(password);
		Utils.tirarPrint(step);
	}

	public void informoUsuarionaTeladeLogin() throws Exception {
		String step = "Informo username na tela de login";
		LoginPage(ChromeLogic.navegador);
		lblUsername.sendKeys(Utils.userName);
		Utils.tirarPrint(step);
	}

	public void informo_Senha_Usuario_Tela_de_Login() throws Exception {
		String step = "Informo senha na tela de login";
		lblPassword.sendKeys(Utils.password);
		Utils.tirarPrint(step);
	}

	public void clicoemSignIn() throws Exception {
		String step = "Clico no botao para realizar login";
		Utils.tirarPrint(step);
		btnSignIn.click();
	}

	public void validarMensagemDadosInvalidos() throws Exception {
		String step = "valido mensagem de dados invalidos na tela de login";
		assertEquals(txtInvalidUserorPassword.getText(), messageInvalidUser);
		Utils.tirarPrint(step);
	}

	public void validarMensagemUsuarioBloqueado() throws Exception {
		String step = "Valido mensagem de usuario bloqueado na tela de login";
		assertEquals(txtInvalidUserorPassword.getText(), messageBlockedUser);
		Utils.tirarPrint(step);
	}

	public void informoSenhaIncorreta() throws Exception {
		String step = "Informo senha incorreta na tela de Login";
		lblPassword.sendKeys("0000000");
		Utils.tirarPrint(step);
	}

}
