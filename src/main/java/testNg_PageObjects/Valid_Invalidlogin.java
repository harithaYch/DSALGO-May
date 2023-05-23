package testNg_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Valid_Invalidlogin {
	@Test(dataProvider = "loginData", dataProviderClass = exceldatasupplier.class)
	public void TestLogin(String userName, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://dsportalapp.herokuapp.com/login");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.xpath(" //div[@role='alert'] ")).isDisplayed());
		/*
		 * @FindBy (xpath="//a[contains(text(),'Sign in')]") public WebElement Signin;
		 * 
		 * @FindBy (xpath="//input[@name='username']") WebElement Username;
		 * 
		 * @FindBy (xpath="//input[@name='password']") public WebElement Password;
		 * 
		 * @FindBy (xpath="//input[@value='Login']") public WebElement Login;
		 */
		Thread.sleep(5000);
		driver.quit();
	}

}