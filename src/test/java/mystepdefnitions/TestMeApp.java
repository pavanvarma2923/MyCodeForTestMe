package mystepdefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeApp {
	WebDriver driver;
	@Given("test me is launched by user")
	public void test_me_is_launched_by_user() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@When("user clicks on SignIn link in landing page")
	public void user_clicks_on_SignIn_link_in_landing_page() {
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
				
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("user provides the valid username {string}")
	public void user_provides_the_valid_username(String uname) {
		driver.findElement(By .name("userName")).sendKeys(uname);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("user provides the valid password {string}")
	public void user_provides_the_valid_password(String pswrd) {
		driver.findElement(By .name("password")).sendKeys(pswrd);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("user clicks for the submission of the data")
	public void user_clicks_for_the_submission_of_the_data() {
		driver.findElement(By .name("Login")).click();
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("verifies the login status for the account")
	public void verifies_the_login_status_for_the_account() {
		String actual=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		String expected="SignOut";
		Assert.assertEquals(actual, expected);
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}


}
