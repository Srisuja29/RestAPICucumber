package stepcucumberfeature;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HookTag2 {

	@Before("@second")
	public void beforeScenario()
	{
		System.out.println("I am before for second scenario");
	}
	
	@Given("^First step(\\d+)$")
	public void first_step(int arg1) throws Throwable {
	   
	}

	@When("^First when(\\d+)$")
	public void first_when(int arg1) throws Throwable {
	
	}

	@Then("^First Then(\\d+)$")
	public void first_Then(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
