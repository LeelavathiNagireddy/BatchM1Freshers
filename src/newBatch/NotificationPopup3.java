package newBatch;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		FirefoxOptions options = new FirefoxOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
