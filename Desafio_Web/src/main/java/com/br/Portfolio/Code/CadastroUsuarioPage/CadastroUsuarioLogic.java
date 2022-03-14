package com.br.Portfolio.Code.CadastroUsuarioPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.ui.Select;
import com.br.Portfolio.Code.Chrome.ChromeLogic;
import com.br.Portfolio.Code.Utils.Utils;

public class CadastroUsuarioLogic extends CadastroUsuarioPageMap {

	private final String invalidUserNameMessage = "Use maximum 15 character";
	private final String invalidEmailMessage = "Your email address isn't formatted correctly";
	private final String diferentPasswordMessage = "Passwords do not match";

	public void informoUsuarioNovoCadastro() throws Exception {
		String step = "Informo username em Novo Cadastro";
		CadastroClientePage(ChromeLogic.navegador);
		lblUserName.sendKeys(Utils.userName);
		Utils.tirarPrint(step);
	}
	
	public void informoUsuarioInvalidoNovoCadastro(String invalidUsername) throws Exception {
		String step = "Informo username invalido em Novo Cadastro";
		CadastroClientePage(ChromeLogic.navegador);
		lblUserName.sendKeys(invalidUsername);
		Utils.tirarPrint(step);
	}

	public void informoEmailNovoCadastro(String email) throws Exception {
		String step = "Informo Email em Novo Cadastro";
		lblEmail.sendKeys(email);
		Utils.tirarPrint(step);
	}

	public void informoSenhaNovoCadastro() throws Exception {
		String step = "Informo senha em Novo Cadastro";
		lblPassword.sendKeys(Utils.password);
		Utils.tirarPrint(step);
	}
	
	public void informoSenhaInvalidaNovoCadastro(String invalidPassword) throws Exception {
		String step = "Informo senha invalida em Novo Cadastro";
		lblPassword.sendKeys(invalidPassword);
		Utils.tirarPrint(step);
	}

	public void confirmoSenhaNovoCadastro() throws Exception {
		String step = "Confirmo senha em Novo Cadastro";
		lblConfirmPassword.sendKeys(Utils.password);
		Utils.tirarPrint(step);
	}
	
	public void diferenteSenhaNovoCadastro(String diferentPassword) throws Exception {
		String step = "Informo diferente senha em Novo Cadastro";
		lblConfirmPassword.sendKeys(diferentPassword);
		Utils.tirarPrint(step);
	}

	public void informoNomeNovoCadastro(String nome) throws Exception {
		String step = "Informo nome em Novo Cadastro";
		lblFirstName.sendKeys(nome);
		Utils.tirarPrint(step);
	}

	public void informoSobrenomeNovoCadastro(String sobrenome) throws Exception {
		String step = "Informo Sobrenome em Novo Cadastro";
		lblLastName.sendKeys(sobrenome);
		Utils.tirarPrint(step);
	}

	public void informoTelefoneNovoCadastro(String telefone) throws Exception {
		String step = "Informo Telefone em Novo Cadastro";
		lblPhoneNumber.sendKeys(telefone);
		Utils.tirarPrint(step);
	}

	public void clicarParaSelecionarPaisNovoCadastro() throws Exception {
		String step = "Clico para selecionar o Pais";
		lstContry.click();
		Utils.tirarPrint(step);
	}

	public void selecionoPaisNovoCadastro(String pais) throws Exception {
		String step = "Seleciono o Pais em Novo Cadastro";
		Utils.tirarPrint(step);
		new Select(lstContry).selectByVisibleText(pais);
	}

	public void informoCidadeNovoCadastro(String cidade) throws Exception {
		String step = "Informo Cidade em Novo Cadastro";
		lblCity.sendKeys(cidade);
		Utils.tirarPrint(step);
	}

	public void informoEnderecoNovoCadastro(String rua) throws Exception {
		String step = "Informo Endereco em Novo Cadastro";
		lblAdress.sendKeys(rua);
		Utils.tirarPrint(step);
	}

	public void informoEstadoNovoCadastro(String estado) throws Exception {
		String step = "Informo Estado em Novo Cadastro";
		lblState.sendKeys(estado);
		Utils.tirarPrint(step);
	}

	public void informoCepNovoCadastro(String cep) throws Exception {
		String step = "Informo CEP em Novo Cadastro";
		lblPostalCode.sendKeys(cep);
		Utils.tirarPrint(step);
	}

	public void selecionoCheckCondicoesNovoCadastro() throws Exception {
		String step = "seleciono o check de condicoes em novo cadatro";
		Utils.tirarPrint(step);
		chkAgreeConditions.click();
	}

	public void clicoemRegistroNovoCadastro() throws Exception {
		String step = "clico no botao para realizar o registro de novo cadastro";
		Utils.tirarPrint(step);
		btnRegister.click();
	}

	public void validoMensagemdeErroNoUsuario() throws Exception {
		String step = "valido mensagem informando campo usurio com mais de 15 caracteres";
		CadastroClientePage(ChromeLogic.navegador);
		assertEquals(txtUserNameErrorMessage.getText(), invalidUserNameMessage);
		Utils.tirarPrint(step);
	}

	public void validoMensagemdeErroNoEmail() throws Exception {
		String step = "valido mensagem informando email invalido";
		CadastroClientePage(ChromeLogic.navegador);
		assertEquals(txtEmailErrorMessage.getText(), invalidEmailMessage);
		Utils.tirarPrint(step);
	}

	public void validoMensagemdeErroNaSenha() throws Exception {
		String step = "mensagem informando senha invalida para cadastro";
		CadastroClientePage(ChromeLogic.navegador);
		assertTrue(txtPasswordErrorMessage.isDisplayed());
		Utils.tirarPrint(step);
	}

	public void validoMensagemdeErroNaConfirmacaodeSenha() throws Exception {
		String step = "mensagem informando diferenca entre as senhas";
		CadastroClientePage(ChromeLogic.navegador);
		assertEquals(txtConfirmPasswordErrorMessage.getText(), diferentPasswordMessage);
		Utils.tirarPrint(step);
	}

}
