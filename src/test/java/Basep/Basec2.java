package Basep;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basec2 {
	public static WebDriver driver;
	public static void Browser_Launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.ajio.com/search/?text=shoue");
		driver.manage().window().maximize();}
	public static void browser_close() {
		driver.close();
	}

}
