package com.tagrem.cars.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import com.tagrem.cars.test.CarsDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;



public class LoginPO extends LoadableComponent<LoginPO>{
	
	@FindBy (id= "LoginForm_login")
	public WebElement userName;
	
	@FindBy (id= "LoginForm_password")
	public WebElement password;
	
	@FindBy (xpath= "//input[@type='submit']")
	public WebElement loginClick;
	
	private String url = "https://inditioncra.net/cra/";
	private String title = "Cars - Administration";
	Actions action = null;
	
	public LoginPO() {
		
		PageFactory.initElements(CarsDriver.getInstance(), this);
		CarsDriver.getInstance().manage().window().maximize();
		action = new Actions(CarsDriver.getInstance());
	}
	
	public void login(String userName,String password)
	{
		this.userName.sendKeys(userName);
		this.password.sendKeys(password);
		loginClick.click();
	}
	

	@Override
	protected void isLoaded() throws Error {
		assertTrue(CarsDriver.getInstance().getTitle().equals(title));
	}

	@Override
	protected void load() {
		CarsDriver.getInstance().get(url);
	}

}
