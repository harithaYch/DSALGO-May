
package testNg_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GraphPageT extends LoginTest {

	// to Select Dropdown
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement Dropdown;
	// To select Graph at Datastructure Dropdown
	@FindBy(xpath = "//a[@href='/graph']")
	public WebElement Graph;

	// Graph
	@FindBy(xpath = "//a[@href='graph']")
	WebElement GraphLink;
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement TryHereButton;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement AnswerForm;
	@FindBy(xpath = "//form[@id='answer_form']/button")
	WebElement RunButton;

	// Graph Representations
	@FindBy(xpath = "//a[contains(@href, 'graph-representations')]")
	WebElement GraphRepresentations;

	// Practice questions

	// methods
	private void dropDown() {

		Dropdown.click();
	}

	private void selectGraph() {

		Graph.click();
	}

	private void graphLink() {

		GraphLink.click();
	}

	private void graphRepresentation() {
		GraphRepresentations.click();
	}

	private void pythoncode() {
		TryHereButton.click();
		AnswerForm.sendKeys("print 'Graph'");
		RunButton.click();
		driver.navigate().back();
	}

	// practice questions
	// Test method calling the above methods
	@Test
	public void RunGraph() {
		PageFactory.initElements(driver, this);
		//loginmethod();
		dropDown();

		selectGraph();

		graphLink();
		pythoncode();
		graphRepresentation();

		pythoncode();
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");

	}
}