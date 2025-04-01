package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods 
{

	@FindBy(id ="signup")
	WebElement signup;
	@FindBy(id ="email")
	WebElement Email;
	@FindBy(id = "password")
	WebElement Pass;
	@FindBy(id = "submit")
	WebElement Submit;


	
	public HomePage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public SignupPage clickSignup()
	{	
		boolean signupdis=signup.isDisplayed();
		Assert.assertTrue(signupdis);
		Assert.assertTrue(signup.isEnabled(), "Signup button is not enabled");
		signup.click();
		return new SignupPage(driver);	
	}
	
	public HomePage EnterEmail() {
		Email.sendKeys("dhanvikdhanya@gmail.com");
		return this;
	}
	
	public HomePage Enterpassword()  {
		Pass.sendKeys("dhanvik24");
		return this;
	} 
	
	public ContactListPage clickSubmit() {
		Submit.click();
		return new ContactListPage(driver);
	}
	
}
