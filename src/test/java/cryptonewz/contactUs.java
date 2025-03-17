package cryptonewz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactUs
{
	 void contactUs_page() throws InterruptedException
		{
	//ChromeDriver driver=new ChromeDriver();
	WebDriver driver= new ChromeDriver();
	driver.get("https://cryptonewz.io/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])")).click();
	Thread.sleep(2000);
	System.out.println("Navigate to contactUs page");
		}
	 void valid_allfields() throws InterruptedException
		{
	WebDriver driver= new ChromeDriver();
	driver.get("https://cryptonewz.io/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactName'])")).sendKeys("anusha");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactEmail'])")).sendKeys("anu1@mailinator.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactOrganization'])")).sendKeys("anudfsfs");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactDesignation'])")).sendKeys("dfsgfesre");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//textarea[@name='contactMessage'])")).sendKeys("anu1@mailinator.com"); //Name can only contain letters and spaces.
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("(//button[contains(text(),'Verify OTP')])")).click();
	Thread.sleep(2000);
	WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'OTP verified successfully. Thank you for contacting us.')])"));   
	if(button.isEnabled())
		
	{
		System.out.println("Submit is  verified successfully");
	}
	else 
	{
		System.out.println("Submit is  not verified successfully");                          
	}
		}
	 
	 void invalid_name() throws InterruptedException
		{
	WebDriver driver= new ChromeDriver();
	driver.get("https://cryptonewz.io/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactName'])")).sendKeys("@#$%^&5432");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactEmail'])")).sendKeys("anu1@mailinator.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactOrganization'])")).sendKeys("anudfsfs");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactDesignation'])")).sendKeys("dfsgfesre");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//textarea[@name='contactMessage'])")).sendKeys("anu1@mailinator.com"); //Name can only contain letters and spaces.
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
	Thread.sleep(20000);
	WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Name can only contain letters and spaces.')])"));   
	if(button.isEnabled())
		
	{
		System.out.println("Submit is not verified successfully");
	}
	else 
	{
		System.out.println("Submit is verified successfully"); //Please enter a valid email address.                         
	}
	
		}
	 void invalid_email() throws InterruptedException
		{
	WebDriver driver= new ChromeDriver();
	driver.get("https://cryptonewz.io/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactName'])")).sendKeys("@#$%^&5432");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactEmail'])")).sendKeys("anu1@mailinator.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactOrganization'])")).sendKeys("anudfsfs");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactDesignation'])")).sendKeys("dfsgfesre");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//textarea[@name='contactMessage'])")).sendKeys("anu1@mailinator.com"); 
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
	Thread.sleep(20000);
	WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid email address.')])"));   
	if(button.isEnabled())
		
	{
		System.out.println("Submit is not verified successfully");
	}
	else 
	{
		System.out.println("Submit is verified successfully");                         
	}
		}
	 void valid_org_num() throws InterruptedException
		{
	WebDriver driver= new ChromeDriver();
	driver.get("https://cryptonewz.io/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactName'])")).sendKeys("anusha");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactEmail'])")).sendKeys("anu1@mailinator.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactOrganization'])")).sendKeys("123456");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactDesignation'])")).sendKeys("dfsgfesre");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//textarea[@name='contactMessage'])")).sendKeys("anu1@mailinator.com"); //Name can only contain letters and spaces.
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("(//button[contains(text(),'Verify OTP')])")).click();
	Thread.sleep(2000);
	WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'OTP verified successfully. Thank you for contacting us.')])"));   
	if(button.isEnabled())
		
	{
		System.out.println("Submit is  verified successfully");
	}
	else 
	{
		System.out.println("Submit is  not verified successfully");                          
	}
		}
	  
	 void valid_designation_num() throws InterruptedException
		{
	WebDriver driver= new ChromeDriver();
	driver.get("https://cryptonewz.io/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactName'])")).sendKeys("anusha");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactEmail'])")).sendKeys("anu1@mailinator.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactOrganization'])")).sendKeys("123456");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='contactDesignation'])")).sendKeys("dfsgfesre");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//textarea[@name='contactMessage'])")).sendKeys("anu1@mailinator.com"); //Name can only contain letters and spaces.
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("(//button[contains(text(),'Verify OTP')])")).click();
	Thread.sleep(2000);
	WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'OTP verified successfully. Thank you for contacting us.')])"));   
	if(button.isEnabled())
		
	{
		System.out.println("Submit is  verified successfully");
	}
	else 
	{
		System.out.println("Submit is  not verified successfully");                          
	}
		}
	 
}
