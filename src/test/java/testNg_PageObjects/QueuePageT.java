package testNg_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class QueuePageT extends LoginTest {

	// to Select Dropdown
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement Dropdown;

	// To select Queue at Datastructure Dropdown
	@FindBy(xpath = "//a[contains(text(),'Queue')]")
	public WebElement Queue;

	// Implementation of Queue in Python
	@FindBy(xpath = "//a[contains(text(),'Implementation of Queue in Python')]")
	WebElement ImplementationPython;
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement TryHereButton;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement AnswerForm;
	@FindBy(xpath = "//form[@id='answer_form']/button")
	WebElement RunButton;

	// Implementation using collections
	@FindBy(xpath = "//a[contains(text(),'Implementation using collections.deque')]")
	WebElement Impcollections;

	// Implementation using array
	@FindBy(xpath = "//a[contains(text(),'Implementation using array')]")
	WebElement ImpArray;
	// Queue Operations
	@FindBy(xpath = "//a[contains(text(),'Queue Operations')]")
	WebElement QueueOperations;

	// Practice questions

	// methods
	private void dropDown() {

		Dropdown.click();
	}

	private void selectQueue() {

		Queue.click();
	}

	private void implementationPython() {
		ImplementationPython.click();
	}

	private void pythoncode() {
		TryHereButton.click();
		AnswerForm.sendKeys("print 'Queue'");
		RunButton.click();
		driver.navigate().back();
	}

	private void impcollections() {
		Impcollections.click();
	}

	private void impArray() {
		ImpArray.click();
	}

	private void queueOperations() {
		QueueOperations.click();
	}

	// practice questions
	// Test method calling the above methods
	@Test
	public void RunQueue() {
		PageFactory.initElements(driver, this);
		 //loginmethod();
		dropDown();
		selectQueue();
		implementationPython();
		pythoncode();
		impcollections();
		pythoncode();
		impArray();
		pythoncode();
		queueOperations();
		pythoncode();
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}
}