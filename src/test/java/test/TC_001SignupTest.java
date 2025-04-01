package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.SignupPage;

public class TC_001SignupTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void setup() {
		testName="Login Test";
		testDescription="Testing the login functionality with positive and negative cases";
	}
	
	
	@Test
	public void SignupTest() throws Exception {
		
		HomePage obj = new HomePage(driver);
		obj.clickSignup();
		SignupPage objsign=new SignupPage(driver);
		objsign.FirstName()
		.LastName()
		.Email()
		.Password()
		.clickSubmit();
	}
	
}
