package steps;

import io.cucumber.java.en.Given;
import pages.Methods;

public class Customer {
	 Methods met = new Methods();
	 String baseURL = "http://localhost:9090";

	 @Given("que insira novo cliente, valido status code {int}")
	 public void que_insira_novo_cliente_valido_status_code(Integer int1) {
	     met.criarNovoClienteCard("{\r\n"
	     		+ "  \"birthDate\": \"1990-10-10\",\r\n"
	     		+ "  \"lastName\": \"massa\",\r\n"
	     		+ "  \"name\": \"criando\"\r\n"
	     		+ "}", baseURL+"/customer", int1);
	 }

	 @Given("que insira cliente ja existente, valido status code {int}")
	 public void que_insira_cliente_ja_existente_valido_status_code(Integer int1) {
		 met.criarNovoClienteCard("{\r\n"
		     		+ "  \"birthDate\": \"1990-10-10\",\r\n"
		     		+ "  \"lastName\": \"massa\",\r\n"
		     		+ "  \"name\": \"criando\"\r\n"
		     		+ "}", baseURL+"/customer", int1);
	 }

	 @Given("insira cliente com data de nascimento futura, valido status code {int}")
	 public void insira_cliente_com_data_de_nascimento_futura_valido_status_code(Integer int1) {
		 met.criarNovoClienteCard("{\r\n"
		     		+ "  \"birthDate\": \"2022-10-10\",\r\n"
		     		+ "  \"lastName\": \"qualidade\",\r\n"
		     		+ "  \"name\": \"testando\"\r\n"
		     		+ "}", baseURL+"/customer", int1);
	 }

	 @Given("que pesquise\\/busque cliente pelo sobrenome, valido status code {int}")
	 public void que_pesquise_busque_cliente_pelo_sobrenome_valido_status_code(Integer int1) {
	     met.pesquisar(baseURL+"/customer/criando/massa", int1);
	 }

	 @Given("que pesquise\\/busque cliente por sobrenome inexistente, valido status code {int}")
	 public void que_pesquise_busque_cliente_por_sobrenome_inexistente_valido_status_code(Integer int1) {
		 met.pesquisar(baseURL+"/customer/user/naotem", int1);
	 }

	 @Given("que acesse cliente pelo id e atualize o sobrenome, valido status code {int}")
	 public void que_acesse_cliente_pelo_id_e_atualize_o_sobrenome_valido_status_code(Integer int1) {
	    met.atualizarDados("{\r\n"
	     		+ "  \"birthDate\": \"1990-10-10\",\r\n"
	     		+ "  \"lastName\": \"massa atualizada\",\r\n"
	     		+ "  \"name\": \"criando\"\r\n"
	     		+ "}", baseURL+"/customer/1", int1);
	 }

	 @Given("que atualize um cliente passando um id nao existente, valido status code {int}")
	 public void que_atualize_um_cliente_passando_um_id_nao_existente_valido_status_code(Integer int1) {
		 met.atualizarDados("{\r\n"
		     		+ "  \"birthDate\": \"1990-10-10\",\r\n"
		     		+ "  \"lastName\": \"massa atualizada\",\r\n"
		     		+ "  \"name\": \"criando\"\r\n"
		     		+ "}", baseURL+"/customer/222", int1);
	 }

	 @Given("que delete um cliente pelo id, valido status code {int}")
	 public void que_delete_um_cliente_pelo_id_valido_status_code(Integer int1) {
	     met.deletarCliente(baseURL+"/customer/3", int1);
	 }

	 @Given("que delete um cliente por id nao existente, valido status code {int}")
	 public void que_delete_um_cliente_por_id_nao_existente_valido_status_code(Integer int1) {
		 met.deletarCliente(baseURL+"/customer/111", int1);
	 }
}
	