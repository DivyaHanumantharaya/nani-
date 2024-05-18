package Allpagesajio;

import org.openqa.selenium.By;

import Basep.Basec;

public class Logininpage extends Basec
{
	
	public static By EmailId=By.id("email");
	public static By passwordId=By.xpath("//input[@name='pass']");
	public static By Login=By.xpath("//*[@name='login']");
	public static void Enter_EmailID(String Email) 
	{
		driver.findElement(EmailId).sendKeys(Email);
	}
	public static void Enter_passwordID(String password)
	{
		driver.findElement(passwordId).sendKeys(password);
	}
	
	public static void Login() 
	{
		driver.findElement(Login).click();
	}
	
}


