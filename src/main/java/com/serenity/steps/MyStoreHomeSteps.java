package com.serenity.steps;

import java.util.List;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.serenity.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class MyStoreHomeSteps {
	private static final Logger log = LoggerFactory.getLogger(MyStoreHomeSteps.class);
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
		List<String> productList = homePage.productMatches();
		int productCount = productList.size();
		System.out.println("Number of Product Listed: "+productCount);
		for(String product: productList) {
			log.info(product);
			Assert.assertTrue(product+" does not contain search key "+searchKey, product.contains(searchKey));
		}
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
		Assert.assertEquals("Sub Category was not matching", subCategory.toUpperCase().trim(),homePage.validateSubCategory());
	}

	@Step
	public void titleDisplayed(String subCategory) {
		String actualTitle = homePage.getDriver().getTitle();
		log.info("Title Expected: "+subCategory+" Actual: "+actualTitle);
		Assert.assertTrue("Title was not matching", actualTitle.contains(subCategory));
	}
	
	@Step
	public void navigateToLoginPage() {
		homePage.clickOnSignInLink();
	}
}
