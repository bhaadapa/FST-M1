package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
				
			WebDriver driver = new FirefoxDriver();
			driver.get("https://training-support.net/webelements/tables");
		        // Print the title of the page
		    System.out.println("Page title: " + driver.getTitle());

		    //print the no.of col's
		    List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
		    //print the no.of row's
		    List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		    //print the cell values of the 3rd row.
		    List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td")); 
		    
		    for(WebElement cell:thirdRow)
		    {
		    	System.out.println(cell.getText());
		    }
		   
		    System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
		    
		    driver.quit();
	}

}
