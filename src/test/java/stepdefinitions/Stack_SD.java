package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.StackPage;

public class Stack_SD {
	
	StackPage SP=new StackPage();
	
	@When("user selects Stack")
	public void user_selects_stack() {
	   SP.dropDown();
	   SP.selectStack();
	}

	@Then("user Clicks oerations in slack")
	public void user_clicks_oerations_in_slack() {
		
		SP.operationsInStack();
		SP.pythoncode();
 }
	
	

	@Then("user clicks trybutton and enters and run the code")
	public void user_clicks_trybutton_and_enters_and_run_the_code() {
		
	}

	
	@When("user is on stack page")
	public void user_is_on_stack_page() {
		System.out.println("user is on stack page");
		
	}

	@Then("user clicks on try here and run the code")
	public void user_clicks_on_try_here_and_run_the_code() {
		//SP.implementation();
	   //SP.pythoncode();
	}
}	
	
	
	