package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_May extends BasePage_May {

	public void loginmethod() {
		Homepage_MayMsession homepage = PageFactory.initElements(driver, Homepage_MayMsession.class);

		homepage.getStarted();

		// Login_MayMseesion login = PageFactory.initElements(driver,
		// Login_MayMseesion.class);

		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("starninja");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome@11");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.xpath(" //div[@role='alert'] ")).isDisplayed());

	}
	

}
