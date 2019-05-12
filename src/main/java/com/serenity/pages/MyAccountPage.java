package com.serenity.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject{
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
	
	@FindBy(css = ".page-heading")
	WebElementFacade pageHeading;

	public String validatesUserIsInMyAccountsPage() {
		log.info("Page heading is: "+ pageHeading.getText().trim());
		return pageHeading.getText().trim();
	}

}
