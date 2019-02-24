package com.serenity.pages;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject{
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
	
	@FindBy(css = ".page-heading")
	WebElementFacade pageHeading;

	public void validatesUserIsInMyAccountsPage() {
		Assert.assertTrue("Page Title is Not correct", getDriver().getTitle().contains("My account"));
		Assert.assertEquals("Page heading is Not correct", "MY ACCOUNT", pageHeading.getText().trim());
	}

}
