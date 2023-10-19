package newBatch;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
driver.get("C:\\Users\\thiru\\Downloads\\index2.html");


Alert alert= driver.switchTo().alert();

alert.sendKeys("alphabeetagama");

Thread.sleep(2000);

alert.dismiss();

driver.quit();
		

	}

}
