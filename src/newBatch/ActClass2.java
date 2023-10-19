package newBatch;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActClass2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/");
		
		WebElement forgotLink = driver.findElement(By.linkText("Forgotten password?"));
		
		String currentWindowBeforeClicking = driver.getWindowHandle();
		
Actions actions = new Actions(driver);

actions.keyDown(Keys.CONTROL).click(forgotLink).keyUp(Keys.CONTROL).perform();

Set<String> allWindowsAfterClicking = driver.getWindowHandles();

allWindowsAfterClicking.remove(currentWindowBeforeClicking);

for(String ref:allWindowsAfterClicking)
{
	driver.switchTo().window(ref);
}

driver.findElement(By.id("did_submit")).click();

driver.quit();
	}

}
