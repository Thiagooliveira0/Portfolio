@AdvantageShopping @Cadastro
Feature: Cadastro
  Feature para cadastro de nova conta

@ID0005  @Cadastro_Novo_Usuario
  Scenario Outline: Cadastro Novo Usuario
    Given navego ate a pagina da advantage online shopping
    And clico no icone do menu usuario 
    And clico para criar novo usuario 
    And informo o usuario para novo cadastro
    And informo o email para novo cadastro "<email>"
    And informo a senha para novo cadastro 
    And confirmo a senha para novo cadastro 
    And informo nome para novo cadastro "Jhon"
    And informo sobrenome para novo cadastro "Montana"
    And informo telefone para novo cadastro "551195959595"
    And clico para selecionar o pais para novo cadastro 
    And seleciono pais para novo cadastro "Brazil"
    And informo cidade para novo cadastro "Sao Paulo"
    And informo endereco para novo cadastro "Rua Macapa"
    And informo estado par novo cadastro "Sao Paulo"
    And informo CEP para novo cadastro "03065011"
    And seleciono o check de condicoes em novo cadatro
    And clico no botao para realizar o registro de novo cadastro
    Then valido usuario logado
    
   Examples: 
      | username   | email          | password |
      | Thiago003  | teste@test.com | Senha123 |