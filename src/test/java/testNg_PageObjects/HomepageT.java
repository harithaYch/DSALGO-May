//package pageObjects;

//public class Homepage {

package testNg_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomepageT {
	// private WebDriver driver;
	/*
	 * public Homepage(WebDriver driver){ this.driver=driver;
	 */
	@FindBy(xpath = "//div[@class='content']/a/button")
	public WebElement Getstarted;

	public void getStarted() {
		Getstarted.click();
	}

}