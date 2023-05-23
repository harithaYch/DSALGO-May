package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Homepage_MayMsession;

public class Getstatedpage_SD {
	public static WebDriver driver ;
			
	
	  
	@Given("open dsalgo portal")
	public void open_dsalgo_portal() {
		driver = new ChromeDriver();
		 driver.get("https://dsportalapp.herokuapp.com");
		 driver.manage().window().maximize();
	    
	}

	@When("clicks on get started")
	public void clicks_on_get_started() {
		Homepage_MayMsession homepage = PageFactory.initElements(driver, Homepage_MayMsession.class);
		
		homepage.getStarted();
	    
	}

	@Then("navigate to home page")
	public void navigate_to_home_page() {
		
	    System.out.println("user is in  home page " +driver.getTitle());
	    driver.close();
	}


}
