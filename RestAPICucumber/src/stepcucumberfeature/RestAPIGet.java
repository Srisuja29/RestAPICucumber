package stepcucumberfeature;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestAPIGet {
	
	@Before
	@When("^Get all info$")
	public void get_all_info() throws Throwable {
	}

	@Then("^verify response time$")
	public void verify_response_time() throws Throwable {
	  
	}
    
	
	@Then("^Verify Status cod$")
	public void verify_Status_cod() throws Throwable {
	    
	  
	}
	@After
	@Then("^close$")
	public void close() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
}
}
