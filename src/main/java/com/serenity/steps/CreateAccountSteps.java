package com.serenity.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.serenity.model.CreateAccount;
import com.serenity.pages.CreateAccountPage;

import net.thucydides.core.annotations.Step;

public class CreateAccountSteps {
	private static Logger log = LoggerFactory.getLogger(CreateAccountSteps.class);
	private CreateAccountPage user;
	
	@Step
	public void createAccount(CreateAccount createAccount) {
		log.info("Entering Account details.");
		user.enterFirstName(createAccount.createNewAccount.firstName);
		user.enterLastName(createAccount.createNewAccount.lastName);
		user.enterPassword(createAccount.createNewAccount.password);
		user.enterAddress(createAccount.createNewAccount.address);
		user.enterCity(createAccount.createNewAccount.city);
		user.selectCountry(createAccount.createNewAccount.country);
		user.selectState(createAccount.createNewAccount.state);
		user.enterZipCode(createAccount.createNewAccount.zipCode);
		user.enterMobilePhone(createAccount.createNewAccount.mobilePhone);
		user.enterAliasAddress(createAccount.createNewAccount.aliasAddress);
		user.clickOnRegisterButton();
		log.info("Saving the account details.");
	}
}
