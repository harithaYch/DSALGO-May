package testNg_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ArrayPage extends loginTest {

	// to Select Dropdown
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement Dropdown;
	// To select ARray at Datastructure Dropdown
	@FindBy(xpath = "//a[contains(text(),'Arrays')]")
	public WebElement Arrays;

	// Arrays in Python
	@FindBy(xpath = "//a[contains(text(),'Arrays in Python')]")
	WebElement ArraysPython;
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement TryHereButton;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement AnswerForm;
	@FindBy(xpath = "//form[@id='answer_form']/button")
	WebElement RunButton;

	// Arrays using list
	@FindBy(xpath = "//a[contains(text(),'Arrays Using List')]")
	WebElement ArraysList;

	// Basic Operations in Lists
	@FindBy(xpath = "//a[contains(text(),'Basic Operations in Lists')]")
	WebElement BasicOInList;
	// Applications of Array
	@FindBy(xpath = "//a[contains(text(),'Applications of Array')]")
	WebElement AppliArray;

	// Practice questions

	// methods
	private void dropDown() {

		Dropdown.click();
	}

	private void selectArray() {

		Arrays.click();
	}

	private void arrayPython() {
		ArraysPython.click();
	}

	private void pythoncode() {
		TryHereButton.click();
		AnswerForm.sendKeys("print 'Array in List'");
		RunButton.click();
		driver.navigate().back();
	}

	private void arrayList() {
		ArraysList.click();
	}

	private void basicOperationList() {
		BasicOInList.click();
	}

	private void applicationArray() {
		AppliArray.click();
	}

	// practice questions
	// Test method calling the above methods
	
	public void RunArray() {
		PageFactory.initElements(driver, this);
		loginmethod();
		dropDown();
		selectArray();
		arrayPython();
		pythoncode();
		arrayList();
		pythoncode();
		basicOperationList();
		pythoncode();
		applicationArray();
		pythoncode();
	}
}
