package newBatch;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationUsingAutoIT1 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/");
		
		Thread.sleep(15000);

	Actions actions = new Actions(driver);
	
		actions.scrollByAmount(0, 2800).perform();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		
//		wait.until(ExpectedConditions.("//a[text()='Swagger documentation']"));
//		
	driver.findElement(By.xpath("//a[contains(text(),'Swagger')]")).click();
	
	driver.switchTo().alert().accept();
	
	Runtime.getRuntime().exec("C:\\Users\\thiru\\OneDrive\\Desktop\\S1\\Authentication.exe");
	}

}
