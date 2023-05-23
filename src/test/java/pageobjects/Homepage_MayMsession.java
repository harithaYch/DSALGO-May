package pageobjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Homepage_MayMsession {

	/*
	 * public Homepage_MayMsession(WebDriver driver){ this.driver=driver;
	 */
	@FindBy(xpath = "//div[@class='content']/a/button")
	public WebElement Getstarted;

	@Test
	public void getStarted() {

		Getstarted.click();
	}

}
