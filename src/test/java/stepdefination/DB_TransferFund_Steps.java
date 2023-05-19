package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DB_TransferFund_Steps {

//	@Given("use should landed on Dashboard page")
//	public void use_should_landed_on_dashboard_page() {
//	    System.out.println("Step 1: open browser");
//	    System.out.println("Step 2: enter url");
//	    System.out.println("Step 3: enter credentials ");
//	    System.out.println("Step 4: click on login btn");
//	    
//	}
//
//	@Then("User enter account no {string} and username {string}")
//	public void user_enter_account_no_and_username(String accno, String name) {
//	    
//		System.out.println(accno);
//		System.out.println(name);
//	}
//
//	@Then("user should enter amount {int}")
//	public void user_should_enter_amount(Integer amount) {
//	    System.out.println(amount);
//	}
//
//	@Then("user should branch name {string} and ifsce code {string}")
//	public void user_should_branch_name_and_ifsce_code(String branch, String code) {
//	    System.out.println(branch);
//	    System.out.println(code);
//	}
	
	
	/* Regular expression----------------------*/
	
	
	
	@Given("^use should landed on Dashboard page$")
	public void use_should_landed_on_dashboard_page() {
	    System.out.println("Step 1: open browser");
	    System.out.println("Step 2: enter url");
	    System.out.println("Step 3: enter credentials ");
	    System.out.println("Step 4: click on login btn");
	    
	}

//	@Then("^User enter account no\"([a-z0-9]+)\"and username\"([a-zA-Z]+)\"$")
//	public void user_enter_account_no_and_username(String accno, String name) {
//	    
//		System.out.println(accno);
//		System.out.println(name);
//	}
	
	@Then("^User enter account no \"([a-z0-9]+)\" and username \"([a-z0]+)\"$")
	public void user_enter_account_no_and_username(String accno, String name) {
	    System.out.println("Account : "+accno);
	    System.out.println("UserName :"+name);
	}

	@Then("^user should enter amount ([\\d]+)$")
	public void user_should_enter_amount(Integer amount) {
	    System.out.println(amount);
	}

	@Then("^user should branch name \"([a-zA-Z0-9]+)\" and ifsce code \"([a-zA-Z0-9]+)\"$")
	public void user_should_branch_name_and_ifsce_code(String branch, String code) {
	    System.out.println(branch);
	    System.out.println(code);
	}
	
	
	
}
