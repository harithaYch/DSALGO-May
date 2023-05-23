package pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePage_May {

	public static WebDriver driver = null;

	@BeforeSuite
	public void initialize() throws IOException {

		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
		// System.setProperty("Webdriver.chrome.driver","C:\\Users\\harit\\eclipse-workspace\\harithatest\\DSALGO-May\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// To open dsalgo portal
		driver.get("https://dsportalapp.herokuapp.com");

	}

//@AfterSuite
//Test cleanup
	/*
	 * public void TeardownTest() { BasePage_MayMsession.driver.quit(); }
	 */

}
