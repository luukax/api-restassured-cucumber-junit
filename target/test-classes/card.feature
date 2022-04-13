#Author: your.email@your.domain.com

@Card
Feature: Card
  Eu quero gerar novos cartoes para clientes

  @CT-10-Card
  Scenario: Gerar novo cartao
    Given gerar novo cartao e validar status code 200
  @CT-11-Card 
  Scenario: Cvv com mais de tres digitos
    Given gerar novo cartao cvv com mais de tres digitos e validar status code 400
  @CT-12-Card   
  Scenario: Preecher expiracao de mes superior a doze
    Given gerar cartao com mes de exiracao superior a doze  400
  @CT-13-Card
  Scenario: Ano de expiracao inferior ao ano atual
    Given gerar cartao informando ano de expiracao menor que o atual 400   
  @CT-14-Card
  Scenario: Numero de cartao menor que desesseis digitos
    Given gerar cartao informando menos que desesseis digitos 400      
  @CT-15-Card
  Scenario: Cartao com mais de desesseis digitos
    Given gerar cartao informando mais de desesseis digitos 400     
  @CT-16-Card
  Scenario: Deletar cartao
    Given deletar cartao salvo no sistema 200 
  @CT-17-Card  
  Scenario: Deletar cartao nao existente no sistema
    Given deleta cartao nao existente 404       