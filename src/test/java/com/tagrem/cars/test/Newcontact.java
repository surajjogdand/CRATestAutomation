package com.tagrem.cars.test;

import java.sql.Driver;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;




public class Newcontact extends LoadableComponent<Newcontact>
{
	@FindBy(how= How.ID, using= "ContactForm_firstname")
	@CacheLookup()
	public WebElement firstname;
	
	@FindBy(how= How.ID, using= "ContactForm_lastname")
	@CacheLookup()
	public WebElement lastname;
	
	@FindBy(how= How.ID, using= "ContactForm_company")
	@CacheLookup()
	public  WebElement company;
	
	@FindBy(how= How.ID, using="ContactForm_email")
	@CacheLookup()
	public WebElement email;
	
	@FindBy(how= How.ID, using="ContactForm_address1")
	@CacheLookup()
	public WebElement contactaddress;
	
	@FindBy(how= How.ID, using="ContactForm_zip")
	@CacheLookup()
	public WebElement zipcode;
	
	@FindBy(how= How.ID, using= "ContactForm_phone1")
	@CacheLookup()
	public WebElement phone1;

	@FindBy(how= How.CSS, using= "#ui-id-2")
	@CacheLookup()
	public WebElement list;
	
	@FindBy(how= How.XPATH, using="//*[@id='gridType_0']")
	@CacheLookup()
	public WebElement assigned;
	
	@FindBy(how= How.XPATH, using="//*[@id='gridType_1']")
	@CacheLookup()
	public WebElement nonassigned;
	
	@FindBy (how = How.XPATH,using ="//input[@value='28']")
	@CacheLookup()
	public WebElement checkbox2;
	
	@FindBy(how= How.XPATH, using="//*[@id='addListBut']")
	@CacheLookup()
	public WebElement assignedselectedlist_button;
	
	@FindBy(how= How.XPATH,using="html/body/div[1]/div[2]/div/div/div[1]/div/div[3]/div/form/div[4]/ul/li[3]/a")
	@CacheLookup()
	public WebElement attribute;
	
	@FindBy (how = How.XPATH,using ="//*[@id='collapse-2']/div/div[1]/ul/li[3]/a")
	@CacheLookup()
	public WebElement industry;
	
	@FindBy(how = How.ID,using ="GroupAttr")
	@CacheLookup()
	public WebElement dropdown1;
	
	//@FindBy(how= How.XPATH,using="//a[.='Region']")
	//@CacheLookup()
	//public WebElement region;
	
	//@FindBy(how= How.XPATH,using="//select[@id='GroupAttr']")
	//@CacheLookup()
	//public WebElement dropdown2;
	
	@FindBy(how= How.ID,using="ui-id-4")
	@CacheLookup()
	public WebElement campaigns;
	
	
	@FindBy(how=How.ID,using="campaignGridTypeC_1")
	@CacheLookup()
	public WebElement notassigned1;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='campaign-grid_chk' and @value ='13']")
	@CacheLookup()
	public WebElement checboxect3;
	
	@FindBy(how=How.XPATH,using="//a[@id='addCampaignBut']")
	@CacheLookup()
	public WebElement assignselectedcampaigns_button;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	@CacheLookup()
	public WebElement savebutton;
	
	
	
	
	
	private WebDriver Driver;
	private String url= "https://inditioncra.net/cars/index.php?r=CraCustomer/contact/createContact";
	private String Title= "Cars.com";
	
	
	@Override
	protected void isLoaded() throws Error {
	assertTrue(Driver.getTitle().equals(Title));
	
		
	}

	@Override
	protected void load() {
		Driver.get(url);
		
	}
  public Newcontact(WebDriver driver)
  	{
	  PageFactory.initElements(driver,this);
	  this.Driver= driver;
  	}

  public void enterDetails(String fname,String lname ,String company1, String address1 ,String email1,String zcode,String phnumb ) throws InterruptedException{
	  	firstname.sendKeys(fname);
	  	lastname.sendKeys(lname);
	  	company.sendKeys(company1);
	  	contactaddress.sendKeys(address1);
	  	email.sendKeys(email1);
	  	phone1.clear();
	  	phone1.sendKeys(phnumb);
	  	zipcode.clear();
	  	zipcode.sendKeys(zcode);
	  	phone1.sendKeys("454");
	  	phone1.sendKeys("454");
	  	list.click();
	  	Thread.sleep(3000);
	  	
	     if(!nonassigned.isSelected());
		  nonassigned.click();
		  assertTrue(nonassigned.isSelected());
		  Thread.sleep(3000);
		
		  //if(!checkbox2.isSelected());
		  //checkbox2.click();
		  //assertTrue(checkbox2.isSelected());
		  
		  checkbox2.click();
		  
		  //if(!assigned.isSelected());
		  //assigned.click();
		  //assertTrue(assigned.isSelected());
		  
		  Thread.sleep(2000);
		  assignedselectedlist_button.click();
		  Thread.sleep(2000);
		  
		  attribute.click();
		  industry.click();
		  Thread.sleep(2000);
		 
		  
		  //Driver.findElement(By.xpath("//option[@value='15']")).click();
		 
		Select dropdown = new Select(dropdown1);
		dropdown.selectByVisibleText("Technology");
		
		 Driver.findElement(By.xpath("//a[@class='btn btn-sm']")).click();
		 Thread.sleep(3000);
		 //region.click();
	     
		 //Select d= new Select(dropdown2);
		// d.selectByVisibleText("Southwest");
         //Driver.findElement(By.xpath("//a[@class='btn btn-sm']"));
         
        campaigns.click();
        Thread.sleep(3000);
        if(!notassigned1.isSelected());
        notassigned1.click();
        assertTrue(notassigned1.isSelected());
        Thread.sleep(3000);
        
        checboxect3.click();
        assignselectedcampaigns_button.click();
        //Thread.sleep(2000);
        
        savebutton.click();      	
  }
}