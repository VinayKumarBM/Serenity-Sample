package com.serenity.pages;


import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject{
	private static final Logger log = LoggerFactory.getLogger(HomePage.class);

	@FindBy(name = "search_query")
	WebElementFacade searchBox;

	@FindBy(name = "submit_search")
	WebElementFacade searchButton;

	@FindBy(xpath = "//div[@class='right-block']/h5/a[@class='product-name']")
	List <WebElementFacade> productList;

	@FindBy(xpath = "//span[@class='cat-name']")
	WebElementFacade subCategory;

	@FindBy(partialLinkText = "Sign in")
	WebElementFacade signIn_Link;
	
	public void productSearch(String searchKey) {
		searchBox.clear();
		searchBox.sendKeys(searchKey);
		searchButton.click();
	}

	public void launchApplication() {
		log.info("Launching the application.");
		open();
		getDriver().manage().window().maximize();
	}

	public void productMatches(String searchKey) {
		int productCount = productList.size();
		System.out.println("Number of Product Listed: "+productCount);
		String product = null;
		for(int i=0; i<productCount; i++) {
			product = productList.get(i).getText().toLowerCase();
			System.out.println(product);
			Assert.assertTrue(product+" does not contain search key "+searchKey, product.contains(searchKey));
		}
	}

	public void selectCategory(String category) {
		log.info("Selecting Category "+category);
		getDriver().findElement(By.linkText(category.toUpperCase())).click();
	}

	public void selectSubCategory(String subCategory) {
		log.info("Selecting Sub-Category "+subCategory);
		getDriver().findElement(By.linkText(subCategory.toUpperCase())).click();
	}

	public void validateSubCategory(String subCategory) {
		subCategory = subCategory.toUpperCase().trim();
		String actualSubCategory = this.subCategory.getText().trim();
		System.out.println("Sub-Category Expected: "+subCategory+" Actual: "+actualSubCategory);
		Assert.assertEquals("Sub Category was not matching", subCategory,actualSubCategory);
	}

	public void validateTitle(String subCategory) {
		String actualTitle = getDriver().getTitle();
		System.out.println("Title Expected: "+subCategory+" Actual: "+actualTitle);
		Assert.assertTrue("Title was not matching", actualTitle.contains(subCategory));
	}

	public void clickOnSignInLink() {
		signIn_Link.click();
	}
}
