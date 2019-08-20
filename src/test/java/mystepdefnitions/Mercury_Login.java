package mystepdefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Mercury_Login {
	WebDriver driver;
	@Given("User has launched the application")
	public void user_has_launched_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		  Dimension d=new Dimension(300,600);
		  driver.manage().window().setSize(d);
		  Point p=new Point(200,300);
		  driver.manage().window().setPosition(p);
		  
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User enters the valid credentials")
	public void user_enters_the_valid_credentials() {
		driver.findElement(By .name("userName")).sendKeys("demo");
		driver.findElement(By .name("password")).sendKeys("demo");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By .name("login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User Verifies the login status")
	public void user_Verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String actual= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).getText();
	    String expected="SIGN-OFF";
	    Assert.assertEquals(actual, expected);
	    driver.close();
	}

	@Given("User Launched the app of mercury tours")
	public void user_Launched_the_app_of_mercury_tours() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		  Dimension d=new Dimension(300,600);
		  driver.manage().window().setSize(d);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on signUp link")
	public void user_clicks_on_signUp_link() {
		driver.findElement(By.linkText("REGISTER"));
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters the valid data in the form")
	public void user_enters_the_valid_data_in_the_form() {
		driver.findElement(By.name("firstName")).sendKeys("pavan");
		driver.findElement(By.name("lastName")).sendKeys("varma");
		driver.findElement(By.name("phone")).sendKeys("8897415373");
		driver.findElement(By.name("userName")).sendKeys("pavanvarma2923");
		driver.findElement(By.name("address1")).sendKeys("7-17-7,vijaya apartment");
		driver.findElement(By.name("city")).sendKeys("pavan");
		driver.findElement(By.name("state")).sendKeys("pavan");
		driver.findElement(By.name("postalcode")).sendKeys("pavan");
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByValue("92");
		driver.findElement(By.name("email")).sendKeys("pavan");
		driver.findElement(By.name("password")).sendKeys("pavan");
		driver.findElement(By.name("confirmPassword")).sendKeys("pavan");
	}

	@When("User clicks on submit button available")
	public void user_clicks_on_submit_button_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("register")).click();
	}

	@Then("User Verifies the registration status")
	public void user_Verifies_the_registration_status() {
		String actual= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).getText();
	    String expected="SIGN-OFF";
	    Assert.assertEquals(actual, expected);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
