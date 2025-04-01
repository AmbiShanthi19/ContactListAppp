package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class ContactDetailspage extends ProjectSpecificationMethods {

	@FindBy(id="edit-contact")
	WebElement editcontact;
	
	@FindBy(id="delete")
	WebElement delete;
	
	@FindBy(id="return")
	WebElement returnto;
	
	
	@FindBy(xpath = "//span[text()='RAJEE']")
	WebElement firstname;
	
	@FindBy(xpath = "//span[text()='ESWARI']")
	WebElement lastname;
	
	@FindBy(xpath = "//span[text()='1997/08/06']")
	WebElement dob;
	
	@FindBy(xpath = "//span[text()='2345678908']")
	WebElement phone;
	

	@FindBy(xpath = "//span[text()='STR1']")
	WebElement street1;
	@FindBy(xpath = "//span[text()='STR2']")
	WebElement street2;
	@FindBy(xpath = "//span[text()='BANGALORE']")
	WebElement city;
	
	@FindBy(xpath ="//span[text()='KARNATAKA']")
	WebElement stateProvince;
	
	@FindBy(xpath = "//span[text()='345678']")
	WebElement postalCode;
	
	@FindBy(xpath = "//span[text()='India']")
	WebElement country;
	
	
	public ContactDetailspage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public EditContactPage clickEdit() {
		editcontact.click();
		return new EditContactPage(driver);
	}
	
	public ContactListPage clickdel() {
		delete.click();
		driver.switchTo().alert().accept();
		return new ContactListPage(driver);
	}
	
	public ContactListPage clickReturn() {
		returnto.click();
		return new ContactListPage(driver);
	}
	
	
	
}
