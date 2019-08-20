package mystepdefnitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyDemoOnTags {
	@Given("User launched the flipkart page")
	public void user_launched_the_flipkart_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("flipkart page is displayed");
	}

	@Then("user able to login")
	public void user_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("user logged in");
	}

	@Given("user searching the prod with code")
	public void user_searching_the_prod_with_code() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("searching the code");
	}

	@Then("user able to add it to cart")
	public void user_able_to_add_it_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("add to cart");
	}

	@Given("user able see the items count on cart")
	public void user_able_see_the_items_count_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("count on cart");
	}

	@Then("user decides to remove an item")
	public void user_decides_to_remove_an_item() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	System.out.println("removeing an item");
	}

	@Given("user has active order")
	public void user_has_active_order() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	System.out.println("active order shown");
	}

	@Then("user verifies the status of the order")
	public void user_verifies_the_status_of_the_order() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	System.out.println("status of the order");
	}

}
