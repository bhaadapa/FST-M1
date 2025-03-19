package activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Activity5 {
	
	WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void setup()  //setup function - driver initialization
	{
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test(groups = {"HeaderTests" , "ButtonTests"})
	public void pageTitleTest()
	{
		String title = driver.getTitle();
		assertEquals(title, "Selenium: Target Practice");
		
	}
	
	@Test(groups = {"pageTitleTests" , "HeaderTests"})
	public void HeaderTest1()
	{
		WebElement header3 = driver.findElement(By.xpath("//h3[contains(@class, 'orange')]"));
		System.out.println("header name display as:"+header3);
	}
	
	
	
	public void tearDown()
	{
		driver.quit();
	}

	

}
