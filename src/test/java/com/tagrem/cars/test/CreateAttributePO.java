package com.tagrem.cars.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAttributePO {

	@FindBy (xpath="//a[.='Admin']")
	@CacheLookup
	public WebElement Admin;
	
	@FindBy (xpath="//a[.='Manage Attributes']")
	@CacheLookup
	public WebElement Manage_Attributes;
	
	@FindBy (xpath="//a[.='Create Attribute']")
	@CacheLookup
	public WebElement Create_Attributes;
	
	@FindBy (xpath="id('EmarketingAttribute_attribute_name')")
	@CacheLookup
	public WebElement attributeName;
	
	public void createAttribute(String attributeName) {

		WebDriver driver = CarsDriver.getInstance();
		
		
		Actions action = new Actions(driver);
		
		WebDriverWait wait_ccb = new WebDriverWait(driver, 30);
		  wait_ccb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Admin']")));
		
		action.moveToElement(Admin).moveToElement(Manage_Attributes).click().build().perform();

		//create new attribute
		Create_Attributes.click();

		this.attributeName.sendKeys(attributeName);

		driver.findElement(By.xpath("//div/select/following-sibling::button")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("tradeshows");
		driver.findElement(By.xpath("//ul/li/a/span[2][.='Check all']")).click();
		driver.findElement(By.xpath("//input[@value='1'][@type='radio']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
