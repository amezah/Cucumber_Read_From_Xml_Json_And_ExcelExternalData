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
import tasks.LoadListFromDB;
import tasks.LoadListFromXml;
import tasks.OpenFacebook;
import tasks.SearchProfilesByName;
import tasks.SearchProfilesFromXml;
import tasks.TypeAcountInformation;

public class SearchXmlStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	private Actor felipito = Actor.named("Felipito");
	
	@Steps
	OpenFacebook openFacebookPage;	
	@Steps
	TypeAcountInformation login;
	@Steps
	LoadListFromXml loadList;
	@Steps
	SearchProfilesFromXml searchFriends;
	
	@Before
	public void setup() {
		felipito.can(BrowseTheWeb.with(herBrowser));		
	}
	
	@Given("that the user opened the page")
	public void thatTheUserOpenedThePage() {
		System.out.println("1");
		givenThat(felipito).wasAbleTo(openFacebookPage);
		givenThat(felipito).wasAbleTo(login);		
	}
	
	@And("he had a list of friends")
	public void heHadAList() {
		System.out.println("2");
		givenThat(felipito).wasAbleTo(loadList);	
	}	
	
	@When("he searches for his friends")
	public void heSearchesForFriends() {
		System.out.println("3");
		when(felipito).attemptsTo(searchFriends);
	}
	
	@Then("he should see his friends")
	public void heShouldSeeHisFriends() {
		System.out.println("4");
		//then(felipito).should(eventually(seeThat()));
	}

}
