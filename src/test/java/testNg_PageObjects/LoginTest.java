package testNg_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginTest extends BasePage {

	// public loginTest(WebDriver driver) {
	// basepage.driver=driver;
	// }

	public void loginmethod() {
		Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		homepage.getStarted();
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		login.setusername("starninja");
		login.setPassword("Welcome@11");
		login.clickOnLoginButton();
	}
	/*
	 * @Test public void dropdowns() { ArrayPage Arrayatdropdown =
	 * PageFactory.initElements(driver, ArrayPage.class);
	 * Arrayatdropdown.dropDown(); }
	 */

	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	public WebElement Signout;

	public void clickSignoutButton() {
		Signout.click();

	}

}