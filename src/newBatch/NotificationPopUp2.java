package newBatch;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	//	driver.get("https://in.puma.com/in/en?gclid=Cj0KCQjwxuCnBhDLARIsAB-cq1o6xcatw-FxNYuDjcceeGqLXE8i3A7j3frrutKpK-azoW865lntHHIaAolzEALw_wcB&utm_aud=OTH&utm_campaign=BS_GGL_IN_BS_GGL_SEA_TXT_Brand-Exact_agency_1000067495857508873&utm_medium=BS&utm_obj=OLC&utm_source=GGL-SEA");
		
		driver.get("https://www.imax.com/");

	}

}
