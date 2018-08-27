package step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

import org.openqa.selenium.WebDriver;

import questions.Result;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import tasks.OpenFacebook;
import tasks.SearchProfilesByName;
import tasks.TypeAcountInformation;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.equalTo;


public class LoginStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	private Actor felipito = Actor.named("Felipito");
	
	@Steps
	OpenFacebook openFacebookPage;
	@Steps
	TypeAcountInformation typesHisAccountInfo;
	
	@Before
	public void setup() {
		felipito.can(BrowseTheWeb.with(herBrowser));		
	}
	
	@Given("that the user opened the facebook page")
	public void thatTheUserOpenedFacebook() {		
		givenThat(felipito).wasAbleTo(openFacebookPage);
	}
	
	@When("he types his account data")
	public void heTypesHisAccountData() {
		when(felipito).attemptsTo(typesHisAccountInfo);
	}
	
	@Then("he should see his name '(.*)' in the main page")
	public void heShouldSeeHisName(String expectedName) {
			
		then(felipito).should(seeThat(Result.is(),equalTo(expectedName)));
	}

}
