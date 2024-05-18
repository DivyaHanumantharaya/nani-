
package Stepdefination;

import Allpagesajio.Logininpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefination extends Logininpage {
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		Browser_Launch();
	    
	}
	
	@When("^user enters valid singlename\"([^\"]*)\"$")
	public void user_enters_valid_username(String username)
{
		Enter_EmailID(username);
	}
	
	@When("^user enters valid password\"([^\"]*)\"$")
	public void user_enters_valid_password(String password)
{
		Enter_passwordID(password);
		
	}
	
	@Then("clicks on submit")
	public void clicks_on_submit() {
		Login();
	    
	}

	/*@When("user enters valid username {string}")
	public void user_enters_valid_username(String emailid) {
		Enter_EmailID(emailid);
	   
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String password) {
		Enter_passwordID(password);
		
	    
	}

	@Then("clicks on submit")
	public void clicks_on_submit() {
		Login();
	    
	}*/

}
