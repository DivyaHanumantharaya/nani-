package Allpagesajio;

import org.openqa.selenium.By;

import Basep.Bsec1;



public class Loginpage  extends Bsec1{
public static By searchId=By.xpath("//input[@name='searchVal']");
	public static By searchbutton=By.xpath("//button[@type='submit']//span");
	
	public static void Enter_searchId(String search) {
		driver.findElement(searchId).sendKeys(search);
	}

		public static void searchbutton() {
			driver.findElement(searchbutton).click();
			
			
		}
		
	}
	
	
	


