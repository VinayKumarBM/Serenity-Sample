package com.serenity.steps;

import com.serenity.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	private LoginPage user;
	
	@Step
	public void enterEmailToCreateAccount(String email) {
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
