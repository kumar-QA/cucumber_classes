package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	@Given("customer landed on loginpage")
	public void customer_landed_on_loginpage() {
		System.out.println("Step 1: lanuch of chrome browser ");
		System.out.println("Step 2: Enter the url ");
		System.out.println("Step 3: landed in the login page ");
	} 
	@When("customer enter username and password")
	public void customer_enter_username_and_password() {
		System.out.println("Step 4: entered username and password ");
	}
	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("clicked on login button");
	}
	@Then("customer should land on homepage")
	public void customer_should_land_on_homepage() {
		System.out.println("landed on homepage");
		System.out.println("closed chrome browser");
	}
}
