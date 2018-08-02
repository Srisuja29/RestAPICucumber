package stepcucumberfeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class step {
	
	WebDriver driver;
	
	public void setup()
	{
	/*System.setProperty(
			"webdriver.gecko.driver",
			"C:\\Users\\Num\\Google Drive\\NAMWorld\\QATester\\NamWorkPlace\\com.cucumber\\src\\geckodriver.exe");
*/	
	}
	//driver.get("www.google.com");
	
	@Given("^User launch the Application$")
	
	public void user_launch_the_Application() throws Throwable {
		
		driver= new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		
		Thread.sleep(1000);
		
	}

	@When("^User enter name$")
	public void user_enter_name() throws Throwable {
		
		System.out.println("Hello");
		WebElement username= driver.findElement(By.xpath(".//*[@id='username']"));
		username.sendKeys("admin");
		
	}

	@When("^User enter the password$")
	public void user_enter_the_password() throws Throwable {
		 WebElement pass= driver.findElement(By.xpath(".//*[@id='password']"));
		 pass.sendKeys("admin");
		  
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement btnLogin=driver.findElement(By.xpath(".//*[@id='Login']"));
		 btnLogin.click();
	  
	}

	@Then("^verify the page title$")
	public void verify_the_page_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
	 
}