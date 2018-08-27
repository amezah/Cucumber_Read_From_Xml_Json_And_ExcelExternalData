package step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import tasks.LoadListFromJson;
import tasks.OpenFacebook;
import tasks.SearchProfilesFromJson;
import tasks.TypeAcountInformation;

public class SearchJsonStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	private Actor felipito = Actor.named("Felipito");
	
	@Steps
	OpenFacebook openFacebookPage;	
	@Steps
	TypeAcountInformation login;
	@Steps
	LoadListFromJson loadList;
	@Steps
	SearchProfilesFromJson searchFriends;
	
	@Before
	public void setup() {
		felipito.can(BrowseTheWeb.with(herBrowser));		
	}
	
	@Given("that the user is in fb page")
	public void thatTheUserIsOnThePage() {		
		givenThat(felipito).wasAbleTo(openFacebookPage);
		givenThat(felipito).wasAbleTo(login);		
	}
	
	@And("he has a list of friends to look for")
	public void heHadAListToLookFor() {
		givenThat(felipito).wasAbleTo(loadList);	
	}	
	
	@When("he searches for them")
	public void heSearchesForThem() {
		when(felipito).attemptsTo(searchFriends);
	}
	
	@Then("he should see the profiles")
	public void heSeeTheProfiles() {
		//then(felipito).should(eventually(seeThat()));
	}

}
