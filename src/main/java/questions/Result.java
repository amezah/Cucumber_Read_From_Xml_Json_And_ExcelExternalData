package questions;

import interfaces.FacebookMainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Result implements Question<String>{
	
	
		
	@Override
	public String answeredBy(Actor actor) {
		System.out.println("Nombre: "+Text.of(FacebookMainPage.USERNAME).viewedBy(actor).asString());
		return Text.of(FacebookMainPage.USERNAME).viewedBy(actor).asString();
	}
	
	public static Result is() {
		return new Result(); 
	}

}
