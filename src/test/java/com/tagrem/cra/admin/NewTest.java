package com.tagrem.cra.admin;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.tagrem.cars.test.GetData;
import com.tagrem.cars.test.LoginPO;

public class NewTest extends GetData {
	
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
	      
@Test (dataProvider = "dp1")
public void createSuperAdmin(String fname,String lname,String uname,String email,String password,String cpassword) throws InterruptedException, NullPointerException {
	System.out.println(fname);
	CreateSuperAdmin cs = new CreateSuperAdmin();
	cs.createSuperAdmin(fname,lname,uname,email,password,cpassword);
}

@DataProvider (name = "dp1")
public Object[][] createData2() {
	      Object[][] retObjArr=getTableArray("src\\test\\resources\\createsuperadmin.xls",
	              "super", "anchor1");
	      return(retObjArr);
}
  @BeforeSuite
  public void beforeSuite() {
	  loginpo = new LoginPO();
		System.out.println("Testing start now");
		loginpo.get();
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Testing done");
  }

}
