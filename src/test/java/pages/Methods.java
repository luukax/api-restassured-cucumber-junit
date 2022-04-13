package pages;


import io.restassured.RestAssured;

public class Methods {
	/*
	 * metodo cria novo objeto no sistema
	 * necessario informar o body, a rota desejada e informar o status code desejado para validaçao
	 */
	public void criarNovoClienteCard(String body,String rota, int statusCode) {
			RestAssured.given()
		 	   .log().all()
		 	   .contentType("application/json")
		 	   .body(body)
		 	.when()
		        .post(rota)  	
		 	.then()
		 	   .statusCode(statusCode);	
		
	}
	/*
	 * metodo pesquisa objeto no sistema
	 * necessario informar a rota e o status code desejado para validaçao
	 */
	public void pesquisar(String rota, int statusCode) {
		RestAssured.given()
	   	   .log().all()
	   	   .contentType("application/json")
	   	.when()
	          .get(rota)  	
	   	.then()
	   	   .statusCode(statusCode);
	}
	/*
	 * metodo para atualizar dados ja cadastrados
	 */
	public void atualizarDados(String body, String rota, int statusCode) {
		RestAssured.given()
 	   .log().all()
 	   .contentType("application/json")
 	   .body(body)
 	.when()
        .put(rota)  	
 	.then()
 	   .statusCode(statusCode);
	}
	public void deletarCliente(String rota, int statusCode) {
		RestAssured.given()
	  	   .log().all()
	  	   .contentType("application/json")
	  	.when()
	         .delete(rota)  	
	  	.then()
	  	   .statusCode(statusCode);
	}
}
