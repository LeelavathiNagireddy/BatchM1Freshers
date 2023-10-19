package newBatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.bcci.tv/articles/2023/news/55556032/bcci-announces-bookmyshow-as-ticketing-platform-for-icc-men-s-cricket-world-cup-2023?type=Latest");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement InternationalLink = driver.findElement(By.linkText("INTERNATIONAL"));
		
		InternationalLink.click();
		
		
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

//wait.until(ExpectedConditions.titleIs("Cricket Schedule - International matches | BCCI"));
		
wait.until(ExpectedConditions.titleContains(" International matches | BCCI"));

driver.findElement(By.linkText("DOMESTIC")).click();

wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[normalize-space(text())='Domestic Live Matches']"))));

	System.out.println("the element is clickable");
	
	
	driver.findElement(By.xpath("//a[normalize-space(text())='Domestic Live Matches']"));

	driver.quit();

	}

}
