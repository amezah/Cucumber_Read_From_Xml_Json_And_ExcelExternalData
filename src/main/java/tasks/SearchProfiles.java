package tasks;

import java.util.ArrayList;

import interfaces.FacebookMainPage;
import model.Perfil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import util.ListaNombres;
import util.PerfilCRUD;

public class SearchProfiles implements Task{
	
	FacebookMainPage fmp;
	String name;
	
	public SearchProfiles(String name) {
		this.name = name;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		fmp.desactivarNotificacion();
		
		actor.attemptsTo(
				Enter.theValue(name).into(fmp.SEARCH_BAR),
		        Click.on(fmp.SEARCH_BUTTON),
		        Click.on(fmp.selectResult(name))			        
				);
			
	}

	public static SearchProfiles search(String name) {
		
		return Tasks.instrumented(SearchProfiles.class, name);
	}

}
