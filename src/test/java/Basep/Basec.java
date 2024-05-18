package Basep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basec {
	public static WebDriver driver;
	public static void Browser_Launch()
	
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public static void browser_close()
	{
		driver.close();
		

		
	}
	
}
