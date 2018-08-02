package runner;

//src/com/feature/login.feature

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

    @RunWith(Cucumber.class)
	@CucumberOptions (
    format={"pretty","html:target/reportApi1.html"},
	glue={"steptest"},
	features={"src/com/featuretest"},
	dryRun=true,strict=true,
	monochrome=true
	)
	
	public class TestRunner {	

}
  //src/com/feature/login.feature
    // or ("smoke,regression") and ("smoke","regression") // ("~smoke,regression") for ignore
   // tags={"@Smoke,@Regression"}