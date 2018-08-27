package tasks;

import interfaces.FacebookLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class OpenFacebook implements Task{
	
	FacebookLoginPage fbp;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
	                Open.browserOn().the(fbp)	                
	        );
	}	
	

}
