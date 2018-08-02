package steps;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import static com.jayway.restassured.RestAssured.*;
import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestAPIPost {

	public Response response;
	RequestSpecBuilder requestSpecBulder;
	RequestSpecification requestspec;
	// https://www.youtube.com/watch?v=tkvkeDI9gRE
	// https://www.youtube.com/watch?v=W1NhwqWC29M&list=PLFGoYjJG_fqoBFPevCDZDCufDX5h-o3yO&index=4

	@Given("^API are up and running \"(.*?)\"$")
	public void api_are_up_and_running(String URL) throws Throwable {

		/*
		 * RestAssured res=new RestAssured(); AuthenticationScheme
		 * authScheme=RestAssured.oauth2("sss"); requestSpecBulder=new
		 * RequestSpecBuilder(); requestSpecBulder.setAuth(authScheme);
		 * requestspec=requestSpecBulder.build(); given().spec(requestspec);
		 */

		response = given().when().get(URL);
		System.out.println(response.contentType());
		response.prettyPrint();

	}

	@When("^Perform Post$")
	public void perform_Post() throws Throwable {

	}

	@Then("^Status code$")
	public void status_code(DataTable statusCode) throws Throwable {
		List<List<String>> data = statusCode.raw();
		// System.out.println(response.contentType());
		System.out.println(response.statusCode());
		// response.body();
		// response.body(matchesJsonSchemaInClasspath("LandlordbyIDSchema.json"));
		System.out.println(data.get(0));

	}

}
