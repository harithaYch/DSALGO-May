//package pageObjects;

//public class DataStructurePage {

//}

package testNg_PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DataStructurePageT extends LoginTest {
	private String HomeUrl = "https://dsportalapp.herokuapp.com/home";
	@FindBy(xpath = "//a[contains(text(),'Get Started')]")
	WebElement DSGetstarted;
	@FindBy(xpath = "//a[contains(text(),'Time Complexity')]")
	WebElement TimmeComp;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement TryEditor;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement AnswerForm;
	@FindBy(xpath = "//form[@id='answer_form']/button")
	WebElement RunButton;

	private void dataStructure() {
		driver.get(HomeUrl);
		DSGetstarted.click();
	}

	private void timeComplexity() {
		TimmeComp.click();
	}

	private void tryEdit() {
		TryEditor.click();
	}

	private void answerForm() {
		AnswerForm.sendKeys("print 'Data Structures'");

	}

	private void run() {
		RunButton.click();
	}

	@Test
	public void RunDataStructure()

	{
		PageFactory.initElements(driver, this);
		//loginmethod();
		dataStructure();
		timeComplexity();
		tryEdit();
		answerForm();
		run();
		// driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		// to logout--shit this code to Graph

		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		LoginTest login = PageFactory.initElements(driver, LoginTest.class);
		login.clickSignoutButton();
	}
}