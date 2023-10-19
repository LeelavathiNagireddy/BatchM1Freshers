package newBatch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mob");
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//input[@name='q']/../../..//ul/li/div"));
		
		for(WebElement ele:autoSuggestions)
		{
			System.out.println(ele.getAttribute("data-tkid"));
		}

}
}