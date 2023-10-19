package newBatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");

		WebElement ebooksLink = driver.findElement(By.xpath("//a[text()='Free Ebooks']"));

		Actions actions = new Actions(driver);

		actions.moveByOffset(964, 75).perform();

		Thread.sleep(2000);

		actions.moveToElement(ebooksLink).perform();

		Thread.sleep(2000);

		WebElement CheatSheetLink = driver.findElement(By.xpath("//a[text()='CheatSheets']"));

		actions.contextClick(CheatSheetLink).perform();

		Thread.sleep(2000);
		
		actions.scrollByAmount(1140, 560).perform();
		
		Thread.sleep(3000);

		driver.quit();
		
		

	}

}
