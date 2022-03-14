@AdvantageShopping @Login @Bloqueio
Feature: Bloqueio Login
  Nesse cenario sera realizado o login de conta via Facebook

@ID0002  @Bloquear_Login
  Scenario Outline: Bloqueio de Login
    Given navego ate a pagina da advantage online shopping
    And clico no icone do menu usuario
		And informo o nome de usuario na tela de login
		And informo a senha errada do usuario na tela de login
		And clico em Sign In na tela de login
		And valido mensagem de Dados Invalidos
		And clico em Sign In na tela de login
		And valido mensagem de Dados Invalidos
		And clico em Sign In na tela de login
		And valido mensagem de Dados Invalidos
		And clico em Sign In na tela de login
		Then valido mensagem de usuario bloqueado
		
		Examples:
		| username | password |
		| onlyTest | Senha123 |
		
				