package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.ContactDetailspage;
import pages.ContactListPage;
import pages.EditContactPage;
import pages.HomePage;

public class TC_007Contactdetailsdeletetest extends ProjectSpecificationMethods {

	@BeforeTest
	public void setup() throws IOException {
		
		testName="ContactList elete";
		testDescription="Testing the login functionality with positive and negative cases";
		testAuthor="Ambika S";
		testCategory="Smoke Testing";
	}
	@Test  // Mandatory for the test to execute 
	public void ContactdetailsTest() throws Exception {
		
		HomePage obj = new HomePage(driver);
		obj.EnterEmail()
		.Enterpassword()
		.clickSubmit();
		ContactListPage objcon=new ContactListPage(driver);
		objcon.deletecontact();
		ContactDetailspage objcond=new ContactDetailspage(driver);
		objcond.clickdel();
}
}