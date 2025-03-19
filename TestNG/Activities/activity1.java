package activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class activity1 {

	WebDriver driver;  //declare class objects
	
	@BeforeClass
	public void setup()  //setup function - driver initialization
	{
		driver = new FirefoxDriver();
		driver.get("https://training-support.net");
	}
	
	@Test(priority = 0)
	public void pageTitleTest()
	{
		assertEquals(driver.getTitle(), "Training Support");
		
	}
	
	@Test(priority = 1)
	public void aboutLinkTest()
	{
		driver.findElement(By.linkText("About Us")).click();
		assertEquals(driver.getTitle(), "About Training Support");
	}
	
		
	public void tearDown() throws InterruptedException
	{
		
		driver.quit();
	}
}
