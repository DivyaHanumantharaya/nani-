package Textexecution1;

import Allpagesajio.Logininpage;

public class Tc01_login extends Logininpage
{
	public static void main(String[] args) {
		Browser_Launch();
		Enter_EmailID("nani@gmail.com");
		Enter_passwordID("nani@123");
		Login() ;
	}

}
