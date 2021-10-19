package com.serenity.pages;


import java.util.ArrayList;
import java.util.List;

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
		searchBox.type(searchKey);
		searchButton.click();
	}

	public void launchApplication() {
		log.info("Launching the application.");
		open();
		getDriver().manage().window().maximize();
	}

	public List<String> productMatches() {
		List<String> products = new ArrayList<String>();
		int productCount = productList.size();
		log.info("Number of Product Listed: "+productCount);
		for(int i=0; i<productCount; i++) {
			products.add(productList.get(i).getText().toLowerCase());
		}
		return products;
	}

	public void selectCategory(String category) {
		log.info("Selecting Category "+category);
		getDriver().findElement(By.linkText(category.toUpperCase())).click();
	}

	public void selectSubCategory(String subCategory) {
		log.info("Selecting Sub-Category "+subCategory);
		getDriver().findElement(By.linkText(subCategory.toUpperCase())).click();
	}

	public String validateSubCategory() {
		return subCategory.getText().trim();
	}

	public void clickOnSignInLink() {
		signIn_Link.click();
	}
}
