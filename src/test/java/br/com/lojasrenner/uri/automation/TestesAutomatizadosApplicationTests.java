package br.com.lojasrenner.uri.automation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.lojasrenner.uri.automation.model.ItemFull;

import static io.restassured.RestAssured.basic;
import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import io.restassured.RestAssured;
import io.restassured.response.Response;

@SpringBootTest
class TestesAutomatizadosApplicationTests {
	
	public static String URL = "https://uristorageprod.blob.core.windows.net/item/v1/001/BR/full/10009.json";

	@Test
	void contextLoads() {
	}
	
	@Test
	public void verificaCabecalhoResposta() {
		get(URL).
			then().
			statusCode(200).
				and().
			contentType("application/octet-stream");
	}
	
	


}
