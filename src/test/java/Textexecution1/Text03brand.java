package Textexecution1;

import Allpagesajio.Loginpage2;

public class Text03brand extends Loginpage2 {
	public static void main(String[] arges) throws Exception {
		Browser_Launch();
		Thread.sleep(2000);
		Brand();
		//Brand1();
		more();
		selectall();
		driver.close();
	}

}
