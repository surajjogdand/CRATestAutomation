package com.tagrem.cars.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class DeleteAttributeGroup {
	
	public void deleteAttributeGroup()
	{
		WebDriver driver = CarsDriver.getInstance();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
		driver.findElement(By.xpath("//a[.='Delete selected items']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			
			//Get the Alert
		
			Alert alert = driver.switchTo().alert();
			
			//Get the Text displayed on Alert using getText() method of Alert class
			String textOnAlert = alert.getText();
			
			//Click OK button, by calling accept() method of Alert Class
			alert.accept();
			
			//Verify Alert displayed correct message to user
			assertEquals("Are you sure to delete this Attribute Group(s)?",textOnAlert);
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			fail("Alert was expected but do not know what developer has done");
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			
			//Get the Alert
		
			Alert alert = driver.switchTo().alert();
			
			//Get the Text displayed on Alert using getText() method of Alert class
			String textOnAlert = alert.getText();
			
			//Click OK button, by calling accept() method of Alert Class
			alert.accept();
			
			//Verify Alert displayed correct message to user
			assertEquals("Items are deleted successfully.",textOnAlert);
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			fail("Alert was expected but do not know what developer has done");
		}
		
	}

}
