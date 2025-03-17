package cryptonewz;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SubmitPR 
{
	//@Test(priority=1)
	 void submitPR_page() throws InterruptedException
		{
	//ChromeDriver driver=new ChromeDriver();
	WebDriver driver= new ChromeDriver();
	driver.get("https://cryptonewz.io/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Submit a PR')])")).click();
	Thread.sleep(2000);
	System.out.println("Navigate to SubmitPR page");
		}
	//@Test(priority=2)
	 void submit_now() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://cryptonewz.io/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit a PR')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit Now')])[1]")).click();
		Thread.sleep(2000);
	}
	//@Test(priority=3)
	 void validall_fields() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://cryptonewz.io/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit a PR')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit Now')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prName'])")).sendKeys("anusha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prEmail'])")).sendKeys("anu10@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prCompanyName'])")).sendKeys("asdugysabhjhd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prPressReleaseTitle'])")).sendKeys("asdu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@name='pressReleaseBrief'])")).sendKeys("nbsbdjsbfhsijahdcsjihdfjwehdfhbefbiewbfwbjfbbjhsdfsdkfjvfdsakjhghjkjhgfhjkjhgchjhgcffuioihguihguhgcfxfdsaseesrdtfdyfdrfdtfdffyugwqertyuqwertyuiopasdfgh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(text(),'Attach file ')])")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("(//button[contains(text(),'Verify OTP')])[1]")).click();  
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'OTP verified successfully. Thank you for contacting us.')])"));   
		if(button.isEnabled())
			
		{
			System.out.println("SubmitPR is  verified successfully");
		}
		else 
		{
			System.out.println("SubmitPR is  not verified successfully");                          
		}
	}
	@Test(priority=4)
	 void invalid_PRname_num() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://cryptonewz.io/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit a PR')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit Now')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prName'])")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prEmail'])")).sendKeys("anusha@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prCompanyName'])")).sendKeys("asdugysabhjhd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prPressReleaseTitle'])")).sendKeys("asdu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@name='pressReleaseBrief'])")).sendKeys("asdsadfgu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(text(),'Attach file ')])")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
		Thread.sleep(30000);
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Name can only contain letters and spaces')])"));   
		if(button.isEnabled())
			
		{
			System.out.println("SubmitPR is not created successfully");
		}
		else 
		{
			System.out.println("SubmitPR is  created successfully");                          
		}
	}
	//@Test(priority=5)
	 void invalid_PRname_spclchar() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://cryptonewz.io/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit a PR')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit Now')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prName'])")).sendKeys("@#$%^&^%");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prEmail'])")).sendKeys("anusha@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prCompanyName'])")).sendKeys("asdugysabhjhd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prPressReleaseTitle'])")).sendKeys("asdu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@name='pressReleaseBrief'])")).sendKeys("asdsadfgu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(text(),'Attach file ')])")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
		Thread.sleep(30000);
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Name can only contain letters and spaces')])"));   //Company Name can only contain letters, numbers, spaces, &, ., and - (2-50 characters)
		if(button.isEnabled())
			
		{
			System.out.println("SubmitPR is not created successfully");
		}
		else 
		{
			System.out.println("SubmitPR is  created successfully");                          
		}
	}
	//@Test(priority=6)
	 void invalid_comp_name() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://cryptonewz.io/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit a PR')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit Now')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prName'])")).sendKeys("snbdhas");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prEmail'])")).sendKeys("anusha@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prCompanyName'])")).sendKeys("@#$#@#$@##");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prPressReleaseTitle'])")).sendKeys("asdu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@name='pressReleaseBrief'])")).sendKeys("asdsadfgu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(text(),'Attach file ')])")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
		Thread.sleep(30000);
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Company Name can only contain letters, numbers, spaces, &, ., and - (2-50 characters)')])"));   
		if(button.isEnabled())
			
		{
			System.out.println("SubmitPR is not created successfully");
		}
		else 
		{
			System.out.println("SubmitPR is  created successfully");                          
		}
	}
	//@Test(priority=7)
	 void invalid_pressrelase_brief() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://cryptonewz.io/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit a PR')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Submit Now')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prName'])")).sendKeys("snbdhas");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prEmail'])")).sendKeys("anusha@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prCompanyName'])")).sendKeys("@#$#@#$@##");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='prPressReleaseTitle'])")).sendKeys("asdu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@name='pressReleaseBrief'])")).sendKeys("asdsadfgu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(text(),'Attach file ')])")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[contains(text(),'Submit')])")).click();
		Thread.sleep(30000);
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Press release brief can only contain 200 characters (max).')])"));   
		if(button.isEnabled())
		{
			System.out.println("SubmitPR is not created successfully");
		}
		else 
		{
			System.out.println("SubmitPR is  created successfully");                          
		}
	}
	
}
