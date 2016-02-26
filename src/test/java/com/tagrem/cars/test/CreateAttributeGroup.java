package com.tagrem.cars.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class CreateAttributeGroup {
	
	public void createAttributeGroup(){
	
		WebDriver driver = CarsDriver.getInstance();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Go to Admin>Attribute groups
		WebElement we1 = driver.findElement(By.xpath("//a[.='Admin']"));
		
		action.moveToElement(we1).moveToElement(driver.findElement(By.xpath("//a[.='Manage Attribute Groups']"))).click().build().perform();
	
		//Create Attribute Group
		driver.findElement(By.xpath("//a[.='Create Attribute Group']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("EmarketingAttributeGroup_group_name")).sendKeys("AutoAttributeGroup8");
		Select dropdown1 = new Select(driver.findElement(By.id("EmarketingAttributeGroup_meta_type")));
		dropdown1.selectByValue("multiple_set");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
