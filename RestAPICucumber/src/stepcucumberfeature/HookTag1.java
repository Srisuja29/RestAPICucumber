package stepcucumberfeature;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HookTag1 {
	
	@Before
	public void beforeScenario()
	{
		System.out.println("I am before");
	}
	
	
	
	
	@After
	public void afterScenario()
	{
		System.out.println("I am after");
	}
	
	@Given("^First step$")
	public void first_step() throws Throwable {
	   
	}

	@When("^First when$")
	public void first_when() throws Throwable {
	   
	}

	@Then("^First Then$")
	public void first_Then() throws Throwable {
	  
	}

	@Given("^Second step$")
	public void second_step() throws Throwable {
	  
	}

	@When("^Second when$")
	public void second_when() throws Throwable {
	   
	}

	@Then("^Second Then$")
	public void second_Then() throws Throwable {
	
	}

	@Given("^Third step$")
	public void third_step() throws Throwable {
	   
	}

	@When("^Third when$")
	public void third_when() throws Throwable {
	 
	}
	
	@Then("^Third Thenee$")
	public void third_Thenee() throws Throwable {
	   
	}

	@Then("^Third Then$")
	public void third_Then() throws Throwable {
	   
	}

	

}
