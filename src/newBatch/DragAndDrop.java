package newBatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/photo-manager.html']"));

	driver.switchTo().frame(frameElement);
	
	WebElement HighTatras = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	
	
	WebElement trash = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
	
	Actions actions=new Actions(driver);
	
	actions.dragAndDrop(HighTatras, trash).perform();
	

	
	
	
	
	
	}

}
