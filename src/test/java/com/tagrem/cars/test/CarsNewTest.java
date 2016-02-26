package com.tagrem.cars.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import com.tagrem.cars.test.GetData;

public class CarsNewTest extends GetData{
	
	LoginPO loginpo = new LoginPO();
	
  //login to cars.com	
  @Test(dataProvider = "dp")
  public void login(String userName, String password) throws NullPointerException
  {
	  System.out.println(userName);
	  loginpo.login(userName, password);
  }
  
  @DataProvider (name = "dp")
  public Object[][] createData1() {
      Object[][] retObjArr=getTableArray("src\\test\\resources\\loginDetails.xls",
              "loginDetails", "anchor1");
      return(retObjArr);
  }
  //Create a new attribute
  @Test (dataProvider = "dp1") 
  public void createAttribute(String attributeName) throws NullPointerException
  {
	  CreateAttributePO createAttributes = new CreateAttributePO();
	  createAttributes.createAttribute(attributeName);
  }
  
  @DataProvider (name = "dp1")
  public Object[][] createData2() {
      Object[][] retObjArr=getTableArray("src\\test\\resources\\createAttribute.xlsx",
              "Sheet1", "anchor1");
      return(retObjArr);
  }
  
  
  //Delete the attribute
  @Test
  public void deleteAttribute()
  {
	  DeleteAttribute deleteAttributes = new DeleteAttribute();
	  deleteAttributes.deleteAttribute();
  }
  
  //create a new attribute group
  @Test
  public void createAttributeGroup()
  {
	  CreateAttributeGroup createAttributeGroup = new CreateAttributeGroup();
	  createAttributeGroup.createAttributeGroup();
  }
  
  //Delete the attribute group
  @Test
  public void deleteAttributeGroup()
  {
	  DeleteAttributeGroup deleteAttributeGroup = new DeleteAttributeGroup();
	  deleteAttributeGroup.deleteAttributeGroup();
  }
  
  //Create a new contact
  @Test
  public void createContact()
  {
	  CreateContact createContact = new CreateContact();
	  createContact.createContact();
  }
  
  @BeforeSuite
  public void setUp() throws Exception {
		
		loginpo = new LoginPO();
		System.out.println("Testing start now");
		loginpo.get();
		
	}

  @AfterSuite
  public void tearDown() throws Exception {
		
		System.out.println("Testing done");
	}

 
  
}
