@AdvantageShopping @Produtos
Feature: Consulta Produto
  Feature criada para consulta de produtos

@ID0004  @Consultar_informacoes_Produto
  Scenario: Consultar produto
    Given navego ate a pagina da advantage online shopping
    And clico no card de headPhones
    And seleciono o primeiro produto
    Then valido o campo titulo
    Then valido o campo preco
    Then valido o campo descricao do produto