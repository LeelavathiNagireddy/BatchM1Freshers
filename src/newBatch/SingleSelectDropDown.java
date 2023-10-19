package newBatch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/signup");
		
		WebElement dayDropDown= driver.findElement(By.id("day"));
		
		Select selectDay= new Select(dayDropDown);
		
		boolean Multiple = selectDay.isMultiple();
		
		if(Multiple==true)

		{
			System.out.println("the day select drop down is multi select");
		}
		
		else
		{
			System.out.println("the day select drop down is single select");
		
		}
		selectDay.selectByIndex(3);
	
		WebElement DaySelectedOption = selectDay.getFirstSelectedOption();
		
		System.out.println("the first selected day is -"+DaySelectedOption.getText());
		
		
		
		
	WebElement MonthDropDown= driver.findElement(By.id("month"));
		
		Select selectMonth= new Select(MonthDropDown);

		selectMonth.selectByValue("7");
		
WebElement MonthSelectedOption = selectMonth.getFirstSelectedOption();
		
		System.out.println("the first selected month is -"+MonthSelectedOption.getText());
	
		
		
WebElement YearDropDown= driver.findElement(By.id("year"));
		
		Select selectYear= new Select(YearDropDown);

		selectYear.selectByVisibleText("2002");
		
WebElement YearSelectedOption = selectYear.getFirstSelectedOption();
		
		System.out.println("the first selected year is -"+YearSelectedOption.getText());
		
List<WebElement> AllDayDropDownOptions = selectDay.getOptions();
		
		int count=1;
		
		for(WebElement options:AllDayDropDownOptions)
		{
			System.out.println("the "+count+"option is -"+options.getText());
			
			count++;
		}
		
		
		driver.quit();
		
		
	}

}
