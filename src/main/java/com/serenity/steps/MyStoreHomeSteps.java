package com.serenity.steps;

import com.serenity.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class MyStoreHomeSteps {
	private HomePage homePage;

	@Step
	public void launchApplication() {
		homePage.launchApplication();
	}

	@Step
	public void searchProduct(String searchKey) {
		homePage.productSearch(searchKey);
	}

	@Step
	public void validateListedProduct(String searchKey) {
		homePage.productMatches(searchKey);
	}

	@Step
	public void selectCategory(String category) {
		homePage.selectCategory(category);
	}
	
	@Step
	public void selectSubCategory(String subCategory) {
		homePage.selectSubCategory(subCategory);
	}

	@Step
	public void subCategoryDisplayed(String subCategory) {
		homePage.validateSubCategory(subCategory);
	}

	@Step
	public void titleDisplayed(String subCategory) {
		homePage.validateTitle(subCategory);
	}
	
	@Step
	public void navigateToLoginPage() {
		homePage.clickOnSignInLink();
	}
}
