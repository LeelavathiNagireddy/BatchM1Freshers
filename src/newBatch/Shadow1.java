package newBatch;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow1 {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("chrome://downloads/");
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	JavascriptExecutor js = (JavascriptExecutor)driver;//right click js path
	
	Object elementObj = js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
	
	WebElement element = (WebElement)elementObj;
	
	element.sendKeys("java");

}
}
