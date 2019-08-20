package mystepdefnitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Logindefinition {
	@Given("Application is launched")
	public void application_is_launched() {
		System.out.println("code for application launching");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User Enters credentials")
	public void user_Enters_credentials() {
		System.out.println("code for credentials login");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
