package Allpagesajio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Basep.Basec2;



public class Loginpage2 extends Basec2{
	public static By selectall=By.xpath("//button[text()='Select All']");
	public static By more=By.xpath("//div[@id='verticalsizegroupformat-brand']/strong[text()='MORE']");
	public static By Brand=By.xpath("//*[text()='brands']");
	public static By Brand1=By.xpath("//input[@type='checkbox']");	
	public static By Applybtn=By.xpath("//button[text()='Apply']");
	
	public static void Brand()
	
	{
     driver.findElement(Brand).click();
    }
		
	//public static By Brand1=By.xpath("//input[@type='checkbox']//parent::div//child::label[text()='1 WALK (10)']");
	public static void Brand1()
	{
		driver.findElement(Brand1).click();
		}
	
	public static void more() {
	WebElement cc=	driver.findElement(more);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		jse.executeScript("arguments[0].click();",cc );
		
	}

public static void selectall() {
	driver.findElement(selectall).click();
	driver.findElement(Applybtn).click();
}
	
}
