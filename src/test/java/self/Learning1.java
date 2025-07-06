package self;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Learning1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("bhaskar.adapa@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@type = 'password']"));
		pwd.sendKeys("Welcome@123");
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[@type = 'submit']"));
		submitBtn.click();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Log in to Facebook");
		
		System.out.println("YOu are real Hero");
		
		driver.quit();
		
		
       
	}

}


