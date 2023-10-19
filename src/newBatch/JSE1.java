package newBatch;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		
		driver.get("https://www.instagram.com/");
		
	JavascriptExecutor jse= (JavascriptExecutor) driver;
	
	jse.executeScript("return document.body.ScrollHeight" );
		

	}

}
