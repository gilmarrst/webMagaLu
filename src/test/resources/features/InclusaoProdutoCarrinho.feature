#Author: gilmarrodriguesst@gmai.com
@zupChallenge
Feature: Realizar a inclusão de um produto no carrinho

  Background: Acessar o site da magazine luiza
    Given acesso o site da magazine luiza

  Scenario: CT01 Informar um Cep valido na tela de produto
    When preencho o campo de busca "Smartphone Xiaomi Mi A3"
    And clico no botão buscar
    Then clico no produto buscado
    When seleciono a capacidade "64GB"
    And preencho o cep "54090-470"
    Then valido o label endereco com o texto "Vila Rica I - Vila Rica - Jaboatao Dos Guararapes/PE"

  Scenario: CT02 Informar um Cep inválido na tela de produto
    When preencho o campo de busca "Smartphone Xiaomi Mi A3"
    And clico no botão buscar
    Then clico no produto buscado
    When seleciono a capacidade "64GB"
    And preencho o cep "11111-111"
    Then valido o label de erro na busca do cep com o texto "Ocorreu um erro na pesquisa pelo CEP. Tentar novamente"

  Scenario: CT03 Realizar a busca e incluir um produto no carrinho
    When preencho o campo de busca "Smartphone Xiaomi Mi A3"
    And clico no botão buscar
    Then clico no produto buscado
    When seleciono a capacidade "64GB"
    And clico no botão Adicionar à sacola
    Then valido o produto adcionado no carrinho

  Scenario: CT04 Realizar a busca e incluir um produto no carrinho informando um cep valido na tela de produto
    When preencho o campo de busca "Smartphone Xiaomi Mi A3"
    And clico no botão buscar
    Then clico no produto buscado
    When seleciono a capacidade "64GB"
    And preencho o cep "54090-470"
    Then valido o label endereco com o texto "Vila Rica I - Vila Rica - Jaboatao Dos Guararapes/PE"
    When clico no botão Adicionar à sacola
    Then valido o produto adcionado no carrinho
    And valido os dados do cep no carrinho

