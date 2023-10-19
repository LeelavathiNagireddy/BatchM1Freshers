package newBatch;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("pass")).sendKeys("4y3756");
		
		driver.findElement(By.xpath("//div[@class='_9lsa']/div")).click();
		
		WebElement passTextFiled = driver.findElement(By.id("passContainer"));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		jse.executeScript("scrollBy(0,200);");
		
		jse.executeScript("arguments[0].style.border='4px solid blue';", passTextFiled);
		
		driver.quit();		
		
		
	}

}
