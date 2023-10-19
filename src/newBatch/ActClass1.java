package newBatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActClass1 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/");
		
		WebElement forgotLink = driver.findElement(By.linkText("Forgotten password?"));
		
Actions actions = new Actions(driver);

actions.keyDown(Keys.CONTROL).click(forgotLink).keyUp(Keys.CONTROL).perform();

Thread.sleep(2000);

driver.quit();
	}

}
