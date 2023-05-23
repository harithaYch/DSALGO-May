package testNg_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class ArrayPageT extends LoginTest {

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

		@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
		WebElement PractQue;

		@FindBy(xpath = "//a[@href='/question/1']")
		WebElement SearchArray;
		@FindBy(xpath = "//a[@href='/question/2']")
		WebElement MaxConsecutive1;
		@FindBy(xpath = "//a[@href='/question/3']")
		WebElement EvenDigits;
		@FindBy(xpath = "//a[@href='/question/4']")
		WebElement SquareOfSA;

		@FindBy(xpath = "(//*[@id='answer_form']/input[2]")
		WebElement Submitbutton;

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
	public void practiceQue() {
		
		PractQue.click();
	}

	// submit button Xpath not taking Handeled alert also..alert()
	public void searchArray() {
		
		SearchArray.click();
	}

	public void maxConsone() {
		
		MaxConsecutive1.click();
	}

	public void findEvenDigits() {
		
		EvenDigits.click();
	}

	public void squareOfSArray() {
		
		SquareOfSA.click();
	}

	public void alert() {
		
		RunButton.click();
		// alert Handling
		System.out.println(driver.switchTo().alert().getText());
		// Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.navigate().back();
	}
		
	// Test method calling the above methods
	@Test
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
		practiceQue();
		System.out.println("Use shuld be in " + driver.getTitle());
		searchArray();
		alert();
		maxConsone();
		alert();
		findEvenDigits();
		alert();
		squareOfSArray();
		alert();
		//driver.navigate().to("https://dsportalapp.herokuapp.com/home"); 
	}
}
