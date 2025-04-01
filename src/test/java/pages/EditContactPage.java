package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class EditContactPage extends ProjectSpecificationMethods {

	
	@FindBy(id ="street2")
	WebElement street1;
	
	@FindBy(id ="submit")
	WebElement EditconSum;
	
	public EditContactPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public EditContactPage erasestreet1() {
		street1.clear();
		return this;
	}
	public ContactDetailspage Submitedtit() {
		EditconSum.click();
		return new ContactDetailspage(driver);
	}


	
}
