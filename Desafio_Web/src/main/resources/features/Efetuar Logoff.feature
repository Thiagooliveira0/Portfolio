@AdvantageShopping @Logout
Feature: Efetuar Log Out
  Nesse cenario sera realizado o login de conta ja cadastrada e logo apos o Logout da mesma

@ID0009  @Realizar_LogOut
  Scenario Outline: Realizar Logout
    Given navego ate a pagina da advantage online shopping
    And clico no icone do menu usuario
    And informo o nome de usuario na tela de login
    And informo a senha do usuario na tela de login
    And clico em Sign In na tela de login
    And valido usuario logado
    And clico sobre a conta logada
    And clico em SignOut
    Then Valido se a conta foi deslogada

    Examples:
    | username  | password |
    | onlyTest2 | Senha123 |