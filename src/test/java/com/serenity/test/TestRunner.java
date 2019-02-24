package com.serenity.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		format = {"pretty", "html:target/cucumber"}
		,features= {"features"}
		,glue = {"com.serenity.stepdefinition"}
		//,dryRun = true
		,monochrome = true
		//,tags="@createNewAccount"
		)
public class TestRunner {

}
