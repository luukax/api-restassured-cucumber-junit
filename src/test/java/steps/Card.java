package steps;

import io.cucumber.java.en.Given;
import pages.Methods;

public class Card {
	
	Methods met = new Methods();
	String baseURL = "http://localhost:9090";
	
	@Given("gerar novo cartao e validar status code {int}")
	public void gerar_novo_cartao_e_validar_status_code(Integer int1) {
		//massa para o teste:
		met.criarNovoClienteCard("{\r\n"
				+ "  \"birthDate\": \"1992-08-15\",\r\n"
				+ "  \"lastName\": \"card\",\r\n"
				+ "  \"name\": \"massa\"\r\n"
				+ "}", baseURL+"/customer", int1);
		//inciando teste de cenario
	    met.criarNovoClienteCard("{\r\n"
	    		+ "  \"brand\": \"VISA\",\r\n"
	    		+ "  \"cvc\": \"111\",\r\n"
	    		+ "  \"expirationMoth\": 2,\r\n"
	    		+ "  \"expirationYear\": 2025,\r\n"
	    		+ "  \"holderName\": \"LOREM IPSUM SILVA\",\r\n"
	    		+ "  \"number\": \"1111111111111112\",\r\n"
	    		+ "  \"customerId\": 1\r\n"
	    		+ "}", baseURL+"/card", int1);
	}
	@Given("gerar novo cartao cvv com mais de tres digitos e validar status code {int}")
	public void gerar_novo_cartao_cvv_com_mais_de_tres_digitos_e_validar_status_code(Integer int1) {
	   met.criarNovoClienteCard("{\r\n"
	    		+ "  \"brand\": \"VISA\",\r\n"
	    		+ "  \"cvc\": \"1110\",\r\n"
	    		+ "  \"expirationMoth\": 2,\r\n"
	    		+ "  \"expirationYear\": 2035,\r\n"
	    		+ "  \"holderName\": \"LOREM IPSUM SILVA\",\r\n"
	    		+ "  \"number\": \"1111111111111112\",\r\n"
	    		+ "  \"customerId\": 2\r\n"
	    		+ "}", baseURL+"/card", int1); 
	}

	@Given("gerar cartao com mes de exiracao superior a doze  {int}")
	public void gerar_cartao_com_mes_de_exiracao_superior_a_doze(Integer int1) {
		 met.criarNovoClienteCard("{\r\n"
		    		+ "  \"brand\": \"VISA\",\r\n"
		    		+ "  \"cvc\": \"111\",\r\n"
		    		+ "  \"expirationMoth\": 13,\r\n"
		    		+ "  \"expirationYear\": 2045,\r\n"
		    		+ "  \"holderName\": \"LOREM IPSUM SILVA\",\r\n"
		    		+ "  \"number\": \"1111111111111112\",\r\n"
		    		+ "  \"customerId\": 2\r\n"
		    		+ "}", baseURL+"/card", int1);
	}

	@Given("gerar cartao informando ano de expiracao menor que o atual {int}")
	public void gerar_cartao_informando_ano_de_expiracao_menor_que_o_atual(Integer int1) {
		 met.criarNovoClienteCard("{\r\n"
		    		+ "  \"brand\": \"VISA\",\r\n"
		    		+ "  \"cvc\": \"111\",\r\n"
		    		+ "  \"expirationMoth\": 2,\r\n"
		    		+ "  \"expirationYear\": 2015,\r\n"
		    		+ "  \"holderName\": \"LOREM IPSUM SILVA\",\r\n"
		    		+ "  \"number\": \"1111111111111112\",\r\n"
		    		+ "  \"customerId\": 2\r\n"
		    		+ "}", baseURL+"/card", int1);
	}

	@Given("gerar cartao informando menos que desesseis digitos {int}")
	public void gerar_cartao_informando_menos_que_desesseis_digitos(Integer int1) {
		 met.criarNovoClienteCard("{\r\n"
		    		+ "  \"brand\": \"VISA\",\r\n"
		    		+ "  \"cvc\": \"111\",\r\n"
		    		+ "  \"expirationMoth\": 2,\r\n"
		    		+ "  \"expirationYear\": 2025,\r\n"
		    		+ "  \"holderName\": \"LOREM IPSUM SILVA\",\r\n"
		    		+ "  \"number\": \"111111111111112\",\r\n"
		    		+ "  \"customerId\": 1\r\n"
		    		+ "}", baseURL+"/card", int1);
	}
	@Given("gerar cartao informando mais de desesseis digitos {int}")
	public void gerar_cartao_informando_mais_de_desesseis_digitos(Integer int1) {
		met.criarNovoClienteCard("{\r\n"
	    		+ "  \"brand\": \"VISA\",\r\n"
	    		+ "  \"cvc\": \"111\",\r\n"
	    		+ "  \"expirationMoth\": 2,\r\n"
	    		+ "  \"expirationYear\": 2025,\r\n"
	    		+ "  \"holderName\": \"LOREM IPSUM SILVA\",\r\n"
	    		+ "  \"number\": \"12345678901234567\",\r\n"
	    		+ "  \"customerId\": 1\r\n"
	    		+ "}", baseURL+"/card", int1);
	}

	@Given("deletar cartao salvo no sistema {int}")
	public void deletar_cartao_salvo_no_sistema(Integer int1) {
	    met.deletarCliente(baseURL+"/card/2", int1);
	}

	@Given("deleta cartao nao existente {int}")
	public void deleta_cartao_nao_existente(Integer int1) {
		met.deletarCliente(baseURL+"/card/12", int1);
	}
}
