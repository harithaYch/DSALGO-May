package testNg_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StackPage extends loginTest {

	// to Select Dropdown
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement Dropdown;
	// To select Stack at Datastructure Dropdown
	@FindBy(xpath = "//a[contains(text(),'Stack')]")
	public WebElement Stack;

	// Operations in Stack
	@FindBy(xpath = "//a[contains(text(),'Operations in Stack')]")
	WebElement OperationsInStack;
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement TryHereButton;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement AnswerForm;
	@FindBy(xpath = "//form[@id='answer_form']/button")
	WebElement RunButton;

	// Implementation in Stack
	@FindBy(xpath = "//a[contains(text(),'Implementation')]")
	WebElement Implementation;

	// Applications page
	@FindBy(xpath = "//a[contains(text(),'Applications')]")
	WebElement Application;

	// Practice Questions page
	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement PracticeQue;

	// methods
	private void dropDown() {

		Dropdown.click();
	}

	private void selectStack() {

		Stack.click();
	}
	// private void O() {
	// OperationsInStack.click();
	// }

	private void pythoncode() {
		TryHereButton.click();
		AnswerForm.sendKeys("print 'Stack'");
		RunButton.click();
		driver.navigate().back();
	}

	private void operationsInStack() {
		OperationsInStack.click();
	}

	private void implementation() {
		Implementation.click();
	}

	private void application() {
		Application.click();
	}

	// practice questions
	// Test method calling the above methods
	
	public void RunStack() {
		PageFactory.initElements(driver, this);
//	loginmethod();
		dropDown();
		selectStack();
		operationsInStack();
		pythoncode();
		implementation();
		pythoncode();
		application();
		TryHereButton.click();
		AnswerForm.sendKeys("asd");
		RunButton.click();
		driver.switchTo().alert().accept();
  //	pythoncode();
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");

	}
}