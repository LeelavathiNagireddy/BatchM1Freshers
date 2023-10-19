package newBatch;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSETiteUrl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.instagram.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String title = jse.executeScript("return document.title;").toString();
		
		String url = jse.executeScript("return document.URL;").toString();
		
		if(url.equals("https://www.instagram.com/")) {
			
			System.out.println("same url");
			
		}
			else
			{
				System.out.println(" not same url");
			}
			
			if(title.contains("Login . Instagram"))
			{
				
				System.out.println("same title");
				
			}
				else
				{
					System.out.println("not same title");
				}
				
		}


	}


