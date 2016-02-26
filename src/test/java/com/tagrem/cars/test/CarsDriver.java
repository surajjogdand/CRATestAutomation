package com.tagrem.cars.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CarsDriver {
	
	private static CarsDriver _carsDriver;
	static WebDriver driver = null;
	private CarsDriver() {
	}
	
	public static WebDriver getInstance()
	{
		if(_carsDriver == null)
		{
		_carsDriver = new CarsDriver();
		 driver = new FirefoxDriver();
		}
		
		return driver;
	}
	
}
