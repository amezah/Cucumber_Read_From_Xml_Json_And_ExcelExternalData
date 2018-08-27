package tasks;

import interfaces.FacebookLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TypeAcountInformation implements Task{	
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(                
                Enter.theValue("email").into(FacebookLoginPage.USER_FIELD),
                Enter.theValue("clave").into(FacebookLoginPage.PASSWORD_FIELD),
                Click.on(FacebookLoginPage.LOGIN_BUTTON)
        );
		
	}

}
