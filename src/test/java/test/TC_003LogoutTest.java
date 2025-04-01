package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.ContactListPage;

public class TC_003LogoutTest extends ProjectSpecificationMethods {
		
	@BeforeTest
	public void setup() throws IOException {
		
		testName="Login Test";
		testDescription="Testing the login functionality with positive and negative cases";
		testAuthor="Ambika S";
		testCategory="Smoke Testing";
	}
	@Test  // Mandatory for the test to execute 
	public void logoutTest() throws Exception {
		
		HomePage obj = new HomePage(driver);
		obj.EnterEmail()
		.Enterpassword()
		.clickSubmit();
		ContactListPage objcon=new ContactListPage(driver);
		objcon.logout();
	}

}
