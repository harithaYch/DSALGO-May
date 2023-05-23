package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Login_MayMseesion {

	// WebDriver driver=new ChromeDriver();
	public String Url = "https://dsportalapp.herokuapp.com/login";

	private WebDriver driver;

	public Login_MayMseesion(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	// Get Started at Homepage
	// @FindBy (xpath="//div[@class='content']/a/button")
	// public WebElement Getstarted;

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	public WebElement Signin;

	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password;
	@FindBy(xpath = "//input[@value='Login']")
	public WebElement Login;

	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement Signout;

	// By Dropdown_DS=By.xpath("//a[@data-toggle='dropdown']");
	// constr

	// This method is to set Email in the email text box

	public void setusername(String strUsername) {
		driver.get(Url);
		Username.sendKeys(strUsername);
	}

	// This method is to set Password in the password text box
	public void setPassword(String strPassword) {
		Password.sendKeys(strPassword);
	}

	// This method is to click on Login Button
	public void clickOnLoginButton() {
		Login.click();
	}

	public void clickSignoutButton() {
		Signout.click();
	}

}
