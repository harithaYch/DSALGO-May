package stepdefinitions;
import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjetsDSALGO.SignInPage;
import utilities.ConfigReader;

public class SignInPage_SD {

	//private SignInPage sp=new SignInPage(DriverFactory.getdriver());
	
	SignInPage sp=new SignInPage(DriverFactory.getdriver());
	
	//String home_url=ConfigReader.getHomePage();
	
	@Given("User is in homepage")
	public void user_is_in_homepage() {
		System.out.println("user is on homepage");
		
	    
	}

	@Then("user clicks signin and redirects to signin page")
	public void user_clicks_signin_and_redirects_to_signin_page() {
		
		sp.signin_link();
		
	   
	}

	@When("user enters username as {string} password as {string}")
	public void user_enters_username_as_password_as(String string, String string2) {
		sp.enter_username(string);
	   sp.enter_pwd(string2);
	    
	}

	@When("user clicks login button and redirects to home page")
	public void user_clicks_login_button_and_redirects_to_home_page() throws InterruptedException {
		 sp.login_click();
		   Thread.sleep(1000);
		//sp.signout();
	}
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		//sp.signin_link();
	}

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String  username, String password) {
		//sp.enter_username( username);
	   // sp.enter_pwd(password);
	}

	@Then("click login button to verify")
	public void click_login_button_to_verify() {
		// sp.login_click();
	}

}             