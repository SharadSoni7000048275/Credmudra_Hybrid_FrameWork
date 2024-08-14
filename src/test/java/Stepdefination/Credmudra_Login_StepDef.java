package Stepdefination;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import Utils.TestContactSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.TestContactSetup;

public class Credmudra_Login_StepDef {
	public WebDriver driver; 
	LoginPage loginpage;
	TestContactSetup testContextSetup;
	
	public Credmudra_Login_StepDef(TestContactSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.loginpage=testContextSetup.pageobjectmanager.getLoginPage();
		
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^The user enters phone number (.+)$")
	public void the_user_enters_PhoneNO(String PhoneNo) {
	    // Write code here that turns the phrase above into concrete actions
		loginpage.Enter_phone_number(PhoneNo);
	}

	@When("User login to the application")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actionsS
		loginpage.Click_on_LoginButton();
	}

	@Then("^The user enters the otp (.+)$")
	public void the_user_enters_OTP(String OTP) {
	    // Write code here that turns the phrase above into concrete actions
		loginpage.OTP_Verify(OTP);
	}

	@Then("User verify the OTP")
	public void user_click_on_verify_button() {
	    // Write code here that turns the phrase above into concrete actions
		loginpage.Click_on_VerifyButton();
	}

}
