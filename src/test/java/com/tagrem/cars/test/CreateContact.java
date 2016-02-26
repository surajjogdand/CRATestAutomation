package com.tagrem.cars.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreateContact {
	
	public void createContact()
	{
		WebDriver driver = CarsDriver.getInstance();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement we1 = driver.findElement(By.xpath("//a[.='Customer']"));
		action.moveToElement(we1).moveToElement(driver.findElement(By.xpath("//a[.='Manage Contacts']"))).click().build().perform();

		//create new contact
		driver.findElement(By.xpath("//a[.='Create Contact']")).click();
		//enter email address
		driver.findElement(By.id("ContactForm_email")).sendKeys("suraj8@indition.net");
		//click on list
		driver.findElement(By.xpath("//span[@id='contactListLabel']")).click();
		//click on "Not Assigned" Radio button
		driver.findElement(By.id("gridType_1")).click();
		//click on first check box
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
		//click on assign selected list
	    driver.findElement(By.id("addListBut")).click();
	    //click on assigned
	    driver.findElement(By.id("gridType_0")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //click on Attribute button
	    driver.findElement(By.xpath("//a[@href='#attributeGroup']")).click();
	    //Click on "Donation Type" Attribute.
	    driver.findElement(By.xpath("//a[.='Donation Type']")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    //click on add all
	    driver.findElement(By.xpath("//a[.='Add all']")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //click on save button
	    driver.findElement(By.xpath("//div/a[.='Save']")).click();
	    //click on tab "Campaign"
	    driver.findElement(By.id("campaignListLabel")).click();
	    //click on "Assigned" Button
	    driver.findElement(By.id("campaignGridTypeC_0")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    //click on "Not Assigned " Button
	    driver.findElement(By.id("campaignGridTypeC_1")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    //click on first checkbox
	    driver.findElement(By.xpath("//input[@value='15']")).click();
	    //click on Assign selected campaigns
	    driver.findElement(By.id("addCampaignBut")).click();
	    //click on "Assigned" Button
	    driver.findElement(By.id("campaignGridTypeC_0")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //click on Save button to create a contact
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
