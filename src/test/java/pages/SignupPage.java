package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class SignupPage extends ProjectSpecificationMethods {
	
	
	@FindBy(id ="submit")
	WebElement submit;
	
	
	public SignupPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public SignupPage FirstName() {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ambikaaa");
		return this;
	}

	public SignupPage LastName() {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Saminathan");
	return this;
	}
	
	public SignupPage Email() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("venkiambika83@gmail.com");
	return this;
	}
	
	public SignupPage Password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
	return this;
	}
	
	public ContactListPage clickSubmit() throws Exception {
		
		submit.click();
		Thread.sleep(3000);
		return new ContactListPage(driver);
	}
	
	
	
}
