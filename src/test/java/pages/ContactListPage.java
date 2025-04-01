package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class ContactListPage extends ProjectSpecificationMethods {
	
	@FindBy(id ="add-contact")
	WebElement AddnewContact;
	
	@FindBy(id ="logout")
	WebElement logout;
	
	public ContactListPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	}
	public AddcontactPage clickAddcontact() throws Exception {
		
		AddnewContact.click();
		Thread.sleep(3000);
		return new AddcontactPage(driver);

	}
	public ContactDetailspage listofcontacts() throws Exception {
		
			Thread.sleep(3000);
			WebElement contact=driver.findElement(By.xpath("//td[text()='ambishanthi19@gmail.com']"));
			//@FindBy(xpath="//td[text()='ambishanthi19@gmail.com']")
			//WebElement email;
			
			contact.isDisplayed();
			System.out.println("Listed contacts are displayed");
			contact.click();
			return new ContactDetailspage(driver);
			
	}
	public ContactDetailspage listofcontacts1() throws Exception   {
		
		Thread.sleep(3000);
		WebElement contact1=driver.findElement(By.xpath("//td[text()='rahee@gmail.com']"));
		//@FindBy(xpath="//td[text()='ambishanthi19@gmail.com']")
		//WebElement email;
		
		contact1.isDisplayed();
		System.out.println("Listed contacts are displayed");
		contact1.click();
		return new ContactDetailspage(driver);
		
}
	public ContactDetailspage deletecontact() throws Exception {
		
		Thread.sleep(3000);
		WebElement contact2=driver.findElement(By.xpath("//td[text()='manikandan@gmail.com']"));
		contact2.click();
		return new ContactDetailspage(driver);
		
}
	public HomePage logout() {
		logout.isDisplayed();
		logout.click();
		return new HomePage(driver);
		
	}
}
