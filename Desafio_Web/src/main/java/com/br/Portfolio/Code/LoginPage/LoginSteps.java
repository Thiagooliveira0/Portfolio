package com.br.Portfolio.Code.LoginPage;

import io.cucumber.java.en.*;

public class LoginSteps {

	LoginLogic login = new LoginLogic();

	@And("clico para criar novo usuario")
	public void clico_no_Botao_Criar_Novo_Usuario() throws Exception {
		login.clicarParaCadastrarNovoUsuario();
	}

	@And("informo o nome de usuario na tela de login {string}")
	public void informo_username_na_Tela_de_Login(String username) throws Exception {
		login.informoUsuarionaTeladeLogin(username);
	}

	@And("informo a senha do usuario na tela de login {string}")
	public void informo_Senha_na_Tela_de_Login(String password) throws Exception {
		login.informo_Senha_Usuario_Tela_de_Login(password);
	}

	@And("informo o nome de usuario na tela de login")
	public void informo_username_na_Tela_de_Login() throws Exception {
		login.informoUsuarionaTeladeLogin();
	}

	@And("informo a senha do usuario na tela de login")
	public void informo_Senha_na_Tela_de_Login() throws Exception {
		login.informo_Senha_Usuario_Tela_de_Login();
	}
	
	@And("informo a senha errada do usuario na tela de login")
	public void informo_Senha_errada_do_Usuario_na_Tela_de_login() throws Exception {
		login.informoSenhaIncorreta();
	}

	@And("clico em Sign In na tela de login")
	public void clico_no_Botao_Signin_na_Tela_de_Login() throws Exception {
		login.clicoemSignIn();
	}

	@Then("valido mensagem de Dados Invalidos")
	public void valido_Mensagem_de_Dados_Invalidos_na_Tela_de_Login() throws Exception {
		login.validarMensagemDadosInvalidos();
	}

	@Then("valido mensagem de usuario bloqueado")
	public void valido_Mensagem_de_Usuario_Bloqueado_na_Tela_de_login() throws Exception {
		login.validarMensagemUsuarioBloqueado();
	}

}
