 package newBatch;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp2AutoIT {

	public static void main(String[] args) throws Throwable {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad=1&gclid=CjwKCAjwjOunBhB4EiwA94JWsOhbfiqYzFhyMf6rBVYRJlXSUmHsh_fYOSrEuXRfHnSdmZTqlfROlhoCNf0QAvD_BwE&gclsrc=aw.ds");

		Actions actions = new Actions(driver);
	
	    actions.scrollByAmount(0, 600).perform();
	    
	    driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	    
	    Runtime.getRuntime().exec("C:\\Users\\thiru\\OneDrive\\Desktop\\S1\\RESUME.exe");
	}

}
