package testng_basepage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Basepage {
	public static WebDriver driver = null;

	@BeforeSuite
	public void initialize() throws IOException {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\sunit\\eclipse-workspace\\DsAlgo_NumpyNinja\\Drivers\\chromedriver.exe");

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


