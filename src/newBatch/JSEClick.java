package newBatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSEClick {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		
	JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		jse.executeScript("scrollBy(0,200);");
		
		Thread.sleep(2000);
		
	WebElement ebooksLink = driver.findElement(By.xpath("//a[text()='Free Ebooks']"));
	
	Actions actions = new Actions(driver);
	
	actions.moveToElement(ebooksLink).perform();
	
	Thread.sleep(2000);
	
	 WebElement iframeButton = driver.findElement(By.id("iFrame"));
		
jse.executeScript("arguments[0].click();", iframeButton);

Thread.sleep(2000);

driver.quit(); 
	}

}
