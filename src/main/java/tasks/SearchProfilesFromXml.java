package tasks;

import interfaces.FacebookMainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import util.ListaNombres;

public class SearchProfilesFromXml implements Task{
		
	FacebookMainPage fmp;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		fmp.desactivarNotificacion();
		
		for (int i = 0; i < ListaNombres.listaXml.size(); i++) {
			String name = ListaNombres.listaXml.get(i);
			actor.attemptsTo(
					Enter.theValue(name).into(fmp.SEARCH_BAR),
			        Click.on(fmp.SEARCH_BUTTON),
			        Click.on(fmp.selectResult(name))			        
					);
		}		
				
	}

}
