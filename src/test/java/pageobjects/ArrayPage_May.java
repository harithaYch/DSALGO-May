package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ArrayPage_May extends LoginTest_May {

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

	

	

	public ArrayPage_May(WebDriver driver) {
		this.driver=driver;
	}

	
	
	// methods
	public void dropDown() {
		InitElements();

		Dropdown.click();

	}

	public void selectArray() {
		InitElements();
		Arrays.click();

	}

	public void arrayPython() {
		InitElements();
		ArraysPython.click();
	}

	public void pythoncode() {
		InitElements();
		TryHereButton.click();
		AnswerForm.sendKeys("print 'Array in List'");
		RunButton.click();
		driver.navigate().back();

	}

	public void arrayList() {
		InitElements();
		ArraysList.click();
	}

	public void basicOperationList() {
		InitElements();
		BasicOInList.click();
	}

	public void applicationArray() {
		InitElements();
		AppliArray.click();
	}

	// practice questions
	public void practiceQue() {
		InitElements();
		PractQue.click();
	}

	// submit button Xpath not taking Handeled alert also..alert()
	public void searchArray() {
		InitElements();
		SearchArray.click();
	}

	public void maxConsone() {
		InitElements();
		MaxConsecutive1.click();
	}

	public void findEvenDigits() {
		InitElements();
		EvenDigits.click();
	}

	public void squareOfSArray() {
		InitElements();
		SquareOfSA.click();
	}

	public void alert() {
		InitElements();
		RunButton.click();
		// alert Handling
		System.out.println(driver.switchTo().alert().getText());
		// Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.navigate().back();
		
	}
	public void InitElements()
	{
		PageFactory.initElements(driver, this);
	}
	/*
	 * private void submit() { Submitbutton.click(); //driver.navigate().back();
	 * 
	 * }
	 */

	// Test method calling the above methods
	@Test
	public void RunArray()

	{
		InitElements();
		loginmethod();
		dropDown();
		System.out.println("Use shuld be in " + driver.getTitle());
		selectArray();

		arrayPython();
		pythoncode();
		System.out.println("Use shuld be in " + driver.getTitle());
		arrayList();
		pythoncode();
		basicOperationList();
		pythoncode();
		applicationArray();
		pythoncode();
		System.out.println("Use shuld be in " + driver.getTitle());
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
		driver.navigate().to("https://dsportalapp.herokuapp.com/home"); 
	}

}