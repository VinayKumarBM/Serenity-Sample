package com.serenity.stepdefinition;

import java.util.Random;

import com.serenity.model.CreateAccount;
import com.serenity.steps.CreateAccountSteps;
import com.serenity.steps.LoginSteps;
import com.serenity.steps.MyAccountSteps;
import com.serenity.steps.MyStoreHomeSteps;
import com.serenity.utilities.JsonReader;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

public class CreateAccoutStepDefinition {
	@Steps
	MyStoreHomeSteps homeSteps;
	@Steps
	LoginSteps loginSteps;
	@Steps
	CreateAccountSteps createAccountSteps;
	@Steps
	MyAccountSteps myAccountSteps;
	
	@When("^I navigate to Login Page by clicking on Sign In button$")
	public void i_navigate_to_Login_Page_by_clicking_on_Sign_In_button() {
		homeSteps.navigateToLoginPage();
	}

	@When("^I enter valid email id and click on create account button$")
	public void i_enter_valid_email_id_and_click_on_create_account_button() {
		Random random = new Random();
		int randNumb = random.nextInt(999);
		String email = String.format("test%s@gmail.com", randNumb);
	    loginSteps.enterEmailToCreateAccount(email);
	}

	@When("^I enter valid (.*) and register the user$")
	public void i_enter_valid_first_and_register_the_user(String dataKey) {
	   JsonReader json = new JsonReader();
	   CreateAccount createAccount = json.getpageByFirstName(dataKey);
	   createAccountSteps.createAccount(createAccount);
	}

	@Then("^I should be navigated to My Account screen$")
	public void i_should_be_navigated_to_My_Account_screen() {
		myAccountSteps.validateMyAccountPage();
	    System.out.println("User is in My Accounts screen");
	}
	
	
}
