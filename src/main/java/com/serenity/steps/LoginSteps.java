package com.serenity.steps;

import com.serenity.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {
	private LoginPage user;
	
	@Step
	public void enterEmailToCreateAccount(String email) {
		System.out.println("Entering Email id: "+email);
		user.enterEmailToCreateAccount(email);
		user.clickOnCreateAccountButton();
	}
	
	@Step
	public void loginToAccount(String email, String password) {
		user.enterEmailToSignin(email);
		user.enterPassword(password);
		user.clickOnLoginButton();
	}
}
