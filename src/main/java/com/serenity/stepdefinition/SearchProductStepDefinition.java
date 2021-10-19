package com.serenity.stepdefinition;

import com.serenity.steps.MyStoreHomeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchProductStepDefinition {
	@Steps
	MyStoreHomeSteps user;

	@Given("I am on the application")
	public void i_am_on_the_application() {
	   user.launchApplication();
	}


	@When("^I search for items containing \"(.*)\"$")
	public void i_search_for_items_containing(String searchKey) {
		System.out.println("When: "+searchKey);
		user.searchProduct(searchKey);
	}

	@Then("^I should only see items related to \"(.*)\"$")
	public void i_should_only_see_items_related_to(String searchKey) {
		System.out.println("Then: "+searchKey);
		user.validateListedProduct(searchKey);
	}
	
	@When("^I have searched for (.*) category$")
	public void i_have_searched_for_category(String category) {
		user.selectCategory(category);
	}

	@When("^I filter results by (.*)$")
	public void i_filter_results(String subCategory) {
	  user.selectSubCategory(subCategory);
	}

	@Then("^I should see only (.*)$")
	public void i_should_only_see(String subCategory) {
	  user.subCategoryDisplayed(subCategory);
	}

	@Then("^Title of the page should be (.*)$")
	public void title_of_the_page_should_be(String subCategory) {
		user.titleDisplayed(subCategory); 
	}
}
