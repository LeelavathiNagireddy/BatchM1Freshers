package newBatch;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWait1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.bcci.tv/articles/2023/news/55556032/bcci-announces-bookmyshow-as-ticketing-platform-for-icc-men-s-cricket-world-cup-2023?type=Latest");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement InternationalLink = driver.findElement(By.linkText("INTERNATIONAL"));
		
		InternationalLink.click();
		
	FluentWait<WebDriver> wait1 = new  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1))
		.ignoring(NoSuchElementException.class).withMessage("applied");
	
	WebElement element = wait1.until(new Function<WebDriver ,WebElement>(){

		@Override
		public WebElement apply(WebDriver driver) {
			
			return driver.findElement(By.linkText("DOMESTIC"));
		}
	}
	);
	
	element.click();
	
	
	wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[normalize-space(text())='Domestic Live Matches']"))));

	System.out.println("the element is clickable");
	
	
	driver.findElement(By.xpath("//a[normalize-space(text())='Domestic Live Matches']"));

	driver.quit();
	} 
	}


