package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selfLearning1 {
    public static void main(String[] args) {
        // Set up Chrome WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Optional: Run in headless mode
        
        WebDriver driver = new ChromeDriver(options);

        try {
            // Step 1: Open the provided URL
            driver.get("https://petdiseasealerts.org/forecast-map");

            // Step 2: Wait for the map to load (this may vary depending on your environment)
            Thread.sleep(5000); // Wait 5 seconds for map to load (you can improve this with WebDriverWait)

            // Step 3: Locate the Texas state element on the map (assume it's an SVG element or path)
            // Find the element for Texas - you need to inspect the correct XPath/CSS selector
            WebElement texas = driver.findElement(By.id("texas")); // Replace with the correct XPath

            // Step 4: Click on the Texas state
            texas.click();

            // Optional: You can perform further actions like verifying page content, waiting for results, etc.

            // Step 5: Close the browser
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
