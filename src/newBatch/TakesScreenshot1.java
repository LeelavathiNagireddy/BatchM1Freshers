package newBatch;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot1 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

        Thread.sleep(2000);
        
		File tempFile=driver.getScreenshotAs(OutputType.FILE);
		

		File PerminentFile=new File("./Screenshot1/firstScreenshot2.png");//if we want we have to change .png to .jpeg

		FileHandler.copy(tempFile, PerminentFile);

	}

}
