package newBatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSESendKeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		
		driver.get("https://www.facebook.com/");
		
	JavascriptExecutor jse= (JavascriptExecutor) driver;
	
WebElement emailTextField = driver.findElement(By.name("email"));

emailTextField.click();

String email="leelavathinagireddy";

		
		jse.executeScript("arguments[0].value=arguments[1];",emailTextField,email);
		
		

	}

}
