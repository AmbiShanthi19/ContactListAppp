package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.AddcontactPage;
import pages.ContactListPage;
import pages.HomePage;


public class TC_004Addnewcontact  extends ProjectSpecificationMethods {
	
@BeforeTest
public void setup() throws IOException {
	
	testName="Login Test";
	testDescription="Testing the login functionality with positive and negative cases";
	testAuthor="Ambika S";
	testCategory="Smoke Testing";
}
@Test  // Mandatory for the test to execute 
public void AddContactTest() throws Exception {
	
	HomePage obj = new HomePage(driver);
	obj.EnterEmail()
	.Enterpassword()
	.clickSubmit();
	ContactListPage objcon=new ContactListPage(driver);
	objcon.clickAddcontact();
	AddcontactPage objaddcon=new AddcontactPage(driver);
	objaddcon.FirstName()
	.LastName()
	.Dateofbirth()
	.Email()
	.Phone()
	.Street1()
	.Street2()
	.City()
	.StateProvince()
	.PostalCode()
	.Country()
	.clickSubmit();
	
}


}
