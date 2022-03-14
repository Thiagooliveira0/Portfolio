package com.br.Portfolio.Code.CadastroUsuarioPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CadastroUsuarioSteps {

	CadastroUsuarioLogic cadastroUsuario = new CadastroUsuarioLogic();

	@And("informo o usuario para novo cadastro")
	public void informo_Nome_de_Usuario_em_novo_Cadastro() throws Exception {
		cadastroUsuario.informoUsuarioNovoCadastro();
	}
	
	@And("informo o usuario invalido para novo cadastro {string}")
	public void informo_usuario_invalido_em_novo_cadastro(String invalidUser) throws Exception {
		cadastroUsuario.informoUsuarioInvalidoNovoCadastro(invalidUser);
	}

	@And("informo o email para novo cadastro {string}")
	public void informo_Email_em_novo_Cadastro(String email) throws Exception {
		cadastroUsuario.informoEmailNovoCadastro(email);
	}

	@And("informo a senha para novo cadastro")
	public void informo_Senha_em_novo_Cadastro() throws Exception {
		cadastroUsuario.informoSenhaNovoCadastro();
	}
	
	@And("informo a senha invalida para novo cadastro {string}")
	public void informo_Senha_Invalido_em_Novo_Cadastro(String invalidPassWord) throws Exception {
		cadastroUsuario.informoSenhaInvalidaNovoCadastro(invalidPassWord);
	}

	@And("confirmo a senha para novo cadastro")
	public void confirmo_Senha_em_novo_Cadastro() throws Exception {
		cadastroUsuario.confirmoSenhaNovoCadastro();
	}
	
	@And("confirmo diferente senha para novo cadastro {string}")
	public void confirmo_Senha_em_novo_Cadastro(String diferentPassword) throws Exception {
		cadastroUsuario.diferenteSenhaNovoCadastro(diferentPassword);
	}

	@And("informo nome para novo cadastro {string}")
	public void informo_Nome_em_novo_Cadastro(String name) throws Exception {
		cadastroUsuario.informoNomeNovoCadastro(name);
	}

	@And("informo sobrenome para novo cadastro {string}")
	public void informo_Sobrenome_em_novo_Cadastro(String lastName) throws Exception {
		cadastroUsuario.informoSobrenomeNovoCadastro(lastName);
	}

	@And("informo telefone para novo cadastro {string}")
	public void informo_Telefone_em_novo_Cadastro(String phone) throws Exception {
		cadastroUsuario.informoTelefoneNovoCadastro(phone);
	}

	@And("clico para selecionar o pais para novo cadastro")
	public void clico_para_Selecionar_Pais_em_novo_Cadastro() throws Exception {
		cadastroUsuario.clicarParaSelecionarPaisNovoCadastro();
	}

	@And("seleciono pais para novo cadastro {string}")
	public void seleciono_Pais_em_novo_Cadastro(String contry) throws Exception {
		cadastroUsuario.selecionoPaisNovoCadastro(contry);
	}

	@And("informo cidade para novo cadastro {string}")
	public void informo_Cidade_em_novo_Cadastro(String city) throws Exception {
		cadastroUsuario.informoCidadeNovoCadastro(city);
	}

	@And("informo endereco para novo cadastro {string}")
	public void informo_Endereco_em_novo_Cadastro(String address) throws Exception {
		cadastroUsuario.informoEnderecoNovoCadastro(address);
	}

	@And("informo estado par novo cadastro {string}")
	public void informo_Estado_em_novo_Cadastro(String state) throws Exception {
		cadastroUsuario.informoEstadoNovoCadastro(state);
	}

	@And("informo CEP para novo cadastro {string}")
	public void informo_Cep_em_novo_Cadastro(String cep) throws Exception {
		cadastroUsuario.informoCepNovoCadastro(cep);
	}

	@And("seleciono o check de condicoes em novo cadatro")
	public void seleciono_check_de_termos_de_Condicao_em_novo_Cadastro() throws Exception {
		cadastroUsuario.selecionoCheckCondicoesNovoCadastro();
	}

	@And("clico no botao para realizar o registro de novo cadastro")
	public void clico_no_Botao_de_Registro_em_novo_Cadastro() throws Exception {
		cadastroUsuario.clicoemRegistroNovoCadastro();
	}

	@Then("valido mensagem informando campo usurio com mais de 15 caracteres")
	public void valido_Mensagem_de_Erro_no_Campo_Username() throws Exception {
		cadastroUsuario.validoMensagemdeErroNoUsuario();
	}

	@Then("valido mensagem informando email invalido")
	public void valido_Mensagem_de_Erro_no_Campo_Email() throws Exception {
		cadastroUsuario.validoMensagemdeErroNoEmail();
	}

	@Then("valido mensagem informando senha invalida para cadastro")
	public void valido_Mensagem_de_Erro_no_Campo_Senha() throws Exception {
		cadastroUsuario.validoMensagemdeErroNaSenha();
	}

	@Then("valido mensagem informando diferenca entre as senhas")
	public void valido_Mensagem_de_Erro_no_Campo_Confirmar_Senha() throws Exception {
		cadastroUsuario.validoMensagemdeErroNaConfirmacaodeSenha();
	}
}
