package com.serenity.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
	
	@FindBy(name = "email_create")
	WebElementFacade createAccountEmail;
	
	@FindBy(name ="SubmitCreate")
	WebElementFacade createAccount_Button;
	
	@FindBy(name ="email")
	WebElementFacade registeredEmail;
	
	@FindBy(name ="passwd")
	WebElementFacade password;
	
	@FindBy(name ="SubmitLogin")
	WebElementFacade login_Button;
	
	public void enterEmailToCreateAccount(String email) {
		log.info("Creating account with "+email);
		createAccountEmail.sendKeys(email);
	}
	
	public void clickOnCreateAccountButton() {
		createAccount_Button.click();
	}

	public void enterEmailToSignin(String email) {
		registeredEmail.type(email);
	}
	
	public void enterPassword(String password) {
		this.password.type(password);
	}
	
	public void clickOnLoginButton() {
		login_Button.click();
	}
	
}
