//package pageObjects;

//public class LinkedListPage {

//}

package testNg_PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LinkedListPageT extends LoginTest {

	// to Select Dropdown
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement Dropdown;
	// To select Linkedlist at Datastructure Dropdown
	@FindBy(xpath = "//a[contains(text(),'Linked List')]")
	public WebElement LinkedList;

	// Linked lists introduction
	@FindBy(xpath = "//a[contains(text(),'Introduction')]")
	WebElement LinkedlistIntroduction;
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement TryHereButton;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement AnswerForm;
	@FindBy(xpath = "//form[@id='answer_form']/button")
	WebElement RunButton;

	// Creating Linkedlists
	@FindBy(xpath = "//a[contains(text(),'Creating Linked LIst')]")
	WebElement Createlinkedlists;

	// Types of Linked List
	@FindBy(xpath = "//a[contains(text(),'Types of Linked List')]")
	WebElement TypesofLinkedList;

	// Implement Linked List in Python
	@FindBy(xpath = "//a[contains(text(),'Implement Linked List in Python')]")
	WebElement ImplementLinkedListinPython;

	// Traversal
	@FindBy(xpath = "//a[contains(text(),'Traversal')]")
	WebElement Traversal;

	// Insertion
	@FindBy(xpath = "//a[contains(text(),'Insertion')]")
	WebElement Insertion;

	// Deletion
	@FindBy(xpath = "//a[contains(text(),'Deletion')]")
	WebElement Deletion;

	// methods
	private void dropDown() {

		Dropdown.click();
	}

	private void LinkedList() {
		LinkedList.click();
	}

	private void LinkedlistIntroduction() {
		LinkedlistIntroduction.click();
		TryHereButton.click();
		AnswerForm.sendKeys("print 'Linkedlist in List'");
		RunButton.click();
		driver.navigate().back();
	}

	private void Createlinkedlists() {
		Createlinkedlists.click();
	}

	private void TypesofLinkedList() {
		TypesofLinkedList.click();
	}

	private void ImplementLinkedListinPython() {
		ImplementLinkedListinPython.click();
	}

	private void Traversal() {
		Traversal.click();
	}

	private void Insertion() {
		Insertion.click();
	}

	private void Deletion() {
		Deletion.click();
	}

	// practice questions
	// Test method calling the above methods
	@Test
	public void RunLinkedlist()

	{
		PageFactory.initElements(driver, this);
	    //loginmethod();
		dropDown();
		LinkedList();
		LinkedlistIntroduction();
		Createlinkedlists();
		TypesofLinkedList();
		ImplementLinkedListinPython();
		Traversal();
		Insertion();
		Deletion();
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}
}
