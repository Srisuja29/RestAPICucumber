package stepcucumberfeature;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.authentication.AuthenticationScheme;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.internal.http.HTTPBuilder;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import static com.jayway.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	
	public Response response;
	
	
	@Given("^Get URL$")
	public void get_URL() throws Throwable {
		
	}

	@When("^Give URL in get$")
	public void give_URL_in_get() throws Throwable {
		response=given().when().get("http://services.groupkt.com/state/get/IND/UP");
		
	}

	@Then("^Varify response b$")
	public void varify_response_b() throws Throwable {
	
	   response.then().statusCode(200);
	  // response.then()
	}



}
