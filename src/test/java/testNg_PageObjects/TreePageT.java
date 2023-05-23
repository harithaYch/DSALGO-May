package testNg_PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TreePageT extends LoginTest {

	// to Select Dropdown
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement Dropdown;
	// To select Tree at Datastructure Dropdown
	@FindBy(xpath = "//a[contains(text(),'Tree')]")
	public WebElement Trees;

	// Arrays in Python
	@FindBy(xpath = "//a[contains(text(),'Overview of Trees')]")
	WebElement OverviewofTree;
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement TryHereButton;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement AnswerForm;
	@FindBy(xpath = "//form[@id='answer_form']/button")
	WebElement RunButton;

	// Terminologies
	@FindBy(xpath = "//a[contains(text(),'Terminologies')]")
	WebElement Terminologies;
	// Types of Trees
	@FindBy(xpath = "//a[contains(text(),'Types of Trees')]")
	WebElement TypesofTrees;

	// Tree Traversals
	@FindBy(xpath = "//a[contains(text(),'Tree Traversals')]")
	WebElement TreeTraversals;

	// Traversals-Illustration
	@FindBy(xpath = "//a[contains(text(),'Traversals-Illustration')]")
	WebElement TraversalsIllustration;

	// Binary Trees
	@FindBy(xpath = "//a[contains(text(),'Binary Trees')]")
	WebElement BinaryTrees;

	// Types of Binary Trees
	@FindBy(xpath = "//a[contains(text(),'Types of Binary Trees')]")
	WebElement TypesofBinaryTrees;

	// Implementation in Python
	@FindBy(xpath = "//a[contains(text(),'Types of Binary Trees')]")
	WebElement ImplementationinPython;

	// Binary Tree Traversals
	@FindBy(xpath = "//a[contains(text(),'Binary Tree Traversals')]")
	WebElement BinaryTreeTraversals;

	// Implementation of Binary Trees
	@FindBy(xpath = "//a[contains(text(),'Implementation of Binary Trees')]")
	WebElement ImplementationofBinaryTrees;

	// Applications of Binary trees
	@FindBy(xpath = "//a[contains(text(),'Applications of Binary trees')]")
	WebElement ApplicationsofBinarytrees;

	// Applications of Binary trees
	@FindBy(xpath = "//a[contains(text(),'Binary Search Trees')]")
	WebElement BinarySearchTrees;

	// Implementation Of BST
	@FindBy(xpath = "//a[contains(text(),'Implementation Of BST')]")
	WebElement ImplementationOfBST;

	// Practice questions

	// methods
	private void dropDown() {

		Dropdown.click();
	}

	private void Trees() {
		Trees.click();
	}

	private void OverviewofTrees() {
		OverviewofTree.click();
		TryHereButton.click();
		AnswerForm.sendKeys("print 'Trees in List'");
		RunButton.click();
		driver.navigate().back();
	}

	private void Terminologies() {
		Terminologies.click();
	}

	private void TypesofTree() {
		TypesofTrees.click();

	}

	private void TreeTraversals() {
		TreeTraversals.click();
	}

	private void TraversalsIllustration() {
		TraversalsIllustration.click();
	}

	private void BinaryTrees() {
		BinaryTrees.click();
	}

	private void TypesofBinaryTrees() {
		TypesofBinaryTrees.click();
	}

	private void ImplementationinPython() {
		ImplementationinPython.click();
	}

	private void ImplementationofBinaryTrees() {
		ImplementationofBinaryTrees.click();
	}

	private void BinaryTreeTraversals() {
		BinaryTreeTraversals.click();
	}

	private void ApplicationsofBinarytrees() {
		ApplicationsofBinarytrees.click();
	}

	private void BinarySearchTrees() {
		BinarySearchTrees.click();
	}

	private void ImplementationOfBST() {
		ImplementationOfBST.click();
	}

	// practice questions
	// Test method calling the above methods
	@Test
	public void RunTree() {
		PageFactory.initElements(driver, this);
     	//loginmethod();
		dropDown();
		Trees();
		OverviewofTrees();
		Terminologies();
		TypesofTree();
		TreeTraversals();
		TraversalsIllustration();
		BinaryTrees();
		TypesofBinaryTrees();
		ImplementationinPython();
		BinaryTreeTraversals();
		ImplementationofBinaryTrees();
		ApplicationsofBinarytrees();
		BinarySearchTrees();
		ImplementationOfBST();
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}

}