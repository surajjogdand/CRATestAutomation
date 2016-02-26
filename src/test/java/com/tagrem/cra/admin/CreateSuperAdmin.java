package com.tagrem.cra.admin;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.tagrem.cars.test.*;

public class CreateSuperAdmin {
	
	public void createSuperAdmin(String fname, String lname, String uname, String email, String password, String cpassword) throws InterruptedException, NullPointerException {
		WebDriver driver = CarsDriver.getInstance();
		
	//	WebDriverWait wait_ccb = new WebDriverWait(driver, 100);
	//	wait_ccb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Admin']")));
		
		Actions action = new Actions(driver);
	    WebElement we1 = driver.findElement(By.xpath("//a[.='Admin']"));
	    try
	    {
	    
		action.moveToElement(we1).moveToElement(driver.findElement(By.xpath("//a[.='User Management']"))).click().build().perform();
		
	    }
	    catch(Exception ex)
	    {
	    	System.out.println(ex);
	    }
		//wait_ccb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li[.='Create User']")));
		driver.findElement(By.xpath("//ul/li[.='Create User']")).click();
		
		//wait_ccb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("EmarketingUserForm_firstname")));
		driver.findElement(By.id("EmarketingUserForm_firstname")).sendKeys(fname);
		
		driver.findElement(By.id("EmarketingUserForm_lastname")).sendKeys(lname);
		driver.findElement(By.id("EmarketingUserForm_username")).sendKeys(uname);
		driver.findElement(By.id("EmarketingUserForm_email")).sendKeys(email);
		driver.findElement(By.id("EmarketingUserForm_password")).sendKeys(password);
		driver.findElement(By.id("EmarketingUserForm_confirm_password")).sendKeys(cpassword);
		
		Select dropdown = new Select(driver.findElement(By.id("EmarketingUserForm_role_id")));
		dropdown.selectByVisibleText("CRA Superadmin");
	}

	

}
