package newBatch;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUp1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		Actions a1= new Actions(driver);
		
		a1.scrollByAmount(0, 200);
		
		driver.findElement(By.id("alertBox")).click();
		
	Alert alert	=driver.switchTo().alert();
	
	System.out.println(alert.getText());
	
alert.accept();
	
	driver.findElement(By.id("confirmBox")).click();
	
	System.out.println(alert.getText());
	
	alert.dismiss();
	
	driver.quit();
		
		

	}

}
