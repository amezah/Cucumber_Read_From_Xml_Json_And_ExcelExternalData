package step_definitions;


import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import tasks.LoadListFromDB;
import tasks.OpenFacebook;
import tasks.SearchProfilesByName;
import tasks.TypeAcountInformation;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.comparesEqualTo;

public class SearchStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	private Actor felipito = Actor.named("Felipito");
	
	@Steps
	OpenFacebook openFacebookPage;
	@Steps
	LoadListFromDB haveAListOfNames;
	@Steps
	TypeAcountInformation login;
	
	
	@Before
	public void setup() {
		felipito.can(BrowseTheWeb.with(herBrowser));		
	}
	
	@Given("that the user opened her facebook account")
	public void thatTheUserOpenedHerFacebookAccount() {		
		givenThat(felipito).wasAbleTo(openFacebookPage);
		givenThat(felipito).wasAbleTo(login);
		
	}
	
	@When("he searches for '(.*)' on fb")
	public void sheSearchesForTheNamesOnFb(String name) {
		when(felipito).attemptsTo(SearchProfilesByName.search(name));
	}
	
	@Then("he should find the profiles")
	public void sheShouldFindTheProfiles() {
			
		//then(felipito).should(eventually(seeThat()));
	}
	
	

}
