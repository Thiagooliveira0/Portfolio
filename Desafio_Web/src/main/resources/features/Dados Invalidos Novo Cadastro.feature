@AdvantageShopping @Cadastro
Feature: Validar campos no cadastro de novo cliente
  Feature para validar campos no cadastro

@ID0006  @Validar_Campos_Formulario_Novo_Cadastro
  Scenario Outline: Validar campos no formulario de Cadastro
    Given navego ate a pagina da advantage online shopping
    And clico no icone do menu usuario
    And clico para criar novo usuario
    And informo o usuario invalido para novo cadastro "<invalidUser>"
    And informo o email para novo cadastro "<invalidEmail>"
    And informo a senha invalida para novo cadastro "<invalidPassword>"
    And confirmo diferente senha para novo cadastro "<diferentpassword>"
    And informo nome para novo cadastro "Jhon"
    Then valido mensagem informando campo usurio com mais de 15 caracteres
    Then valido mensagem informando email invalido
    Then valido mensagem informando senha invalida para cadastro
		Then valido mensagem informando diferenca entre as senhas
		
		Examples:
		| invalidUser      | invalidEmail    | invalidPassword  | diferentpassword |
		| InvalidUsernames | invalidemail@   | senhainvalida    | diferentpassword |