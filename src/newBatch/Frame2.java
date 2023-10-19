package newBatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws Throwable {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		
		driver.findElement(By.id("iFrame")).click();
		
			Thread.sleep(2000);
			


		
	
		driver.switchTo().frame("globalSqa");
		
		driver.findElement(By.xpath("//h1[text()='Trainings']/../..//span[text()='Home']"));


	driver.quit();

	}

}
