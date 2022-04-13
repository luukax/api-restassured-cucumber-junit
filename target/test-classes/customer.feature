#Author: lucasramosqa@lucasramosqa.gmail.com


@Customer
Feature: Customer
  Eu quero incluir, atualizar e deletar cadastros de clientes para validar a funcionalidade

  @CT-01-Customer
  Scenario: Salvar novo cliente
    Given que insira novo cliente, valido status code 200
  @CT-02-Customer
  Scenario: Salvar cliente ja existente
    Given que insira cliente ja existente, valido status code 400
  @CT-03-Customer 
  Scenario: Salvar cliente com data de nascimento futura
    Given insira cliente com data de nascimento futura, valido status code 400
  @CT-04-Customer
  Scenario: Pesquisar cliente pelo sobrenome
    Given que pesquise/busque cliente pelo sobrenome, valido status code 200  
  @CT-05-Customer
  Scenario: Pesquisar cliente por sobrenome inexistente
    Given que pesquise/busque cliente por sobrenome inexistente, valido status code 404
  @CT-06-Customer
  Scenario: Atualizar sobrenome de um cliente
    Given que acesse cliente pelo id e atualize o sobrenome, valido status code 200    
  @CT-07-Customer   
  Scenario: Atualizar um cliente por um id não salvo
    Given que atualize um cliente passando um id nao existente, valido status code 404 
  @CT-08-Customer   
  Scenario: Deletar um cliente do sistema pelo id
    Given que delete um cliente pelo id, valido status code 200   
  @CT-09-Customer   
  Scenario: Deletar um cliente com id não existente
    Given que delete um cliente por id nao existente, valido status code 404  