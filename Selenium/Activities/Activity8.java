package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity8 {

	public static void main(String[] args) {
	
		 WebDriver driver = new FirefoxDriver();
		 Actions builder = new Actions(driver);
		 
		 //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
         driver.get("https://training-support.net/webelements/mouse-events");
         System.out.println("Page title: " + driver.getTitle());
         //driver.findElement(By.id("genButton")).click();
//         wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
 //        System.out.println("Word found: "+driver.findElement(By.id("word")).getText());
         
         WebElement cargoLock = driver.findElement(By.xpath("//h1[text() ='Cargo.lock']"));
         WebElement cargoToml = driver.findElement(By.xpath("//h1[text() ='Cargo.toml']"));
         WebElement srcBtn = driver.findElement(By.xpath("//h1[text() ='src']"));
         WebElement targetBtn = driver.findElement(By.xpath("//h1[text() ='target']"));
         builder.click(cargoLock).pause(2000).click(cargoToml).build().perform();
         String acnMsg = driver.findElement(By.id("result")).getText();
         System.out.println(acnMsg);
         builder.doubleClick(srcBtn).pause(2000).contextClick(targetBtn).pause(2000).perform();
         builder.click(driver.findElement(By.xpath("//span[text()='open']"))).build().perform();
         
         String acnMsg1 = driver.findElement(By.id("result")).getText();
         
         System.out.println(acnMsg1);
         
         
         
	        
	}

}
