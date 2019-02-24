package com.serenity.steps;

import com.serenity.pages.MyAccountPage;

public class MyAccountSteps {
	private MyAccountPage user;
	
	public void validateMyAccountPage() {
		user.validatesUserIsInMyAccountsPage();
	}
}
