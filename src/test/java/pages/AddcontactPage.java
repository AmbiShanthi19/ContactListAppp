package pages;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class AddcontactPage extends ProjectSpecificationMethods {

	
	@FindBy(id ="submit")
	WebElement Submit;
	
	@FindBy(xpath="//span[@id='error']")
	WebElement DateError;
	
	public AddcontactPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);

	}
	
	public AddcontactPage FirstName( ) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ambikaaa");
		return this;
	}

	public AddcontactPage LastName () {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Saminathan");
	return this;
	}
	
	public AddcontactPage Dateofbirth() {
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("1994-02-19");
	return this;
	}
	
	public AddcontactPage Email() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ambishanthi191@gmail.com");
	return this;
	}
	
	public AddcontactPage Phone() {
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456789");
	return this;
	}
	
	public AddcontactPage Street1() {
		driver.findElement(By.xpath("//input[@id='street1']")).sendKeys("1/44 abc street");
	return this;
	}
	
	public AddcontactPage Street2() {
		driver.findElement(By.xpath("//input[@id='street2']")).sendKeys("1/44 abc street");
	return this;
	}
	
	public AddcontactPage City() {
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Coimbatore");
	return this;
	}
	
	public AddcontactPage StateProvince() {
		driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("TamilNadu");
	return this;
	}
	
	public AddcontactPage PostalCode() {
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("TamilNadu");
	return this;
	}
	
	public AddcontactPage Country() {
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
	return this;
	}
	
	public ContactListPage clickSubmit() {
		
		Submit.click();
		//boolean dateerror=DateError.isDisplayed();
		//String dob="Enter the correct DOB";
		//Assert.assertTrue(dateerror,"Enter the correct DOB");
		return new ContactListPage(driver);
	}
	
}
