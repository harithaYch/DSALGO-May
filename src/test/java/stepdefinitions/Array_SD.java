package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ArrayPage_May;

public class Array_SD {
	 
	
	 WebDriver driver=DriverFactory.getdriver();
	   ArrayPage_May AP=new ArrayPage_May(driver);
	

	@When("The user is in homepage")
	public void the_user_is_in_homepage() {
		
		System.out.println("user is on home page " +driver.getTitle());
		
		
	}

	@When("User Should be in Page {string}")
	public void user_should_be_in_page(String string) {
 System.out.println(" Numpy ninja page");	    
	}

	@When("User opens the dropdown")
	public void user_opens_the_dropdown() {
		AP.dropDown();
	}

	@Then("user should click Array")
	public void user_should_click_array() {
	    AP.selectArray();
	}

	@Then("User should navigate to {string} Page")
	public void user_should_navigate_to_page(String string) {
		System.out.println("user is on home page " +driver.getTitle());
	}
	
	@When("user clicks array in python")
	public void user_clicks_array_in_python() {
		 WebDriver driver=DriverFactory.getdriver();
		AP.arrayPython();
	}
	@Then("user clicks on Tryhere")
	public void user_clicks_on_tryhere() {
	    AP.pythoncode();
	}
	@Then("user enters python code")
	public void user_enters_python_code() {
	    
	}
	@Then("user clicks run button")
	public void user_clicks_run_button() {
	   
	}

	@When("user cliks arrays using list")
	public void user_cliks_arrays_using_list() {
	    AP.arrayList();
	}

	@Then("user navigated to array using list page")
	public void user_navigated_to_array_using_list_page() {
		 AP.pythoncode();
	}

	@When("user clicks Tryherebutton")
	public void user_clicks_tryherebutton() {
	    System.out.println("User clicks try here button");
	}

	@When("user enters Code in test editor")
	public void user_enters_code_in_test_editor() {
		 System.out.println("User enters ptyhon code" );
	}

	@Then("user clicks on run")
	public void user_clicks_on_run() {
		 System.out.println("Execute the python code");
	}

	@When("user click on Basicoperations in list")
	public void user_click_on_basicoperations_in_list() throws InterruptedException {
		AP.basicOperationList();
		Thread.sleep(1000);
	}

	@Then("User clcks tryhere button and enters code and run it")
	public void user_clcks_tryhere_button_and_enters_code_and_run_it() {
		AP.pythoncode();
	    
	}
	
	@When("User clicks on Application of Array")
	public void user_clicks_on_application_of_array() {
		AP.applicationArray();
	}

	@Then("User Clicks on tryhere and in text area code shuld be enter and then run")
	public void user_clicks_on_tryhere_and_in_text_area_code_shuld_be_enter_and_then_run() {
		AP.pythoncode();
	}

	@When("user click on practice questions")
	public void user_click_on_practice_questions() {
	    AP.practiceQue();
	}

	@When("user is on practice page")
	public void user_is_on_practice_page() {
	    System.out.println("User is on practice questions page " +driver.getTitle());
	}

	@Then("User clicks search the array")
	public void user_clicks_search_the_array() {
	    AP.searchArray();
	}

	@Then("User clicks run button")
	public void user_clicks_run_button1() {
		//AP.alert();
	}

	@Then("alert opens and user shold handle the alert")
	public void alert_opens_and_user_shold_handle_the_alert() {
		AP.alert();
	}

@When("User clicks on maxcosecutive one")
public void user_clicks_on_maxcosecutive_one() {
	AP.maxConsone();
	
    
}
@Then("alert should be handled")
public void alert_should_be_handled() {
	AP.alert();
}
@Then("user click tryheree and then run button")
public void user_click_tryheree_and_then_run_button() {
	System.out.println("User is on practice questions page " +driver.getTitle());

}

@When("User clicks Find numbers with even number of digits")
public void user_clicks_find_numbers_with_even_number_of_digits() {
	AP.findEvenDigits();
}

@Then("user clicks on run button")
public void user_clicks_on_run_button() {
    
}

@Then("user alert handle")
public void user_alert_handle() {
	AP.alert();

}
@When("User clicks Squares of sorted Array")
public void user_clicks_squares_of_sorted_array() {
	AP.squareOfSArray();
	
}

@Then("Alert will come user needs to handle it")
public void alert_will_come_user_needs_to_handle_it() {
    AP.alert();
    driver.navigate().to("https://dsportalapp.herokuapp.com/home"); 
}
}
