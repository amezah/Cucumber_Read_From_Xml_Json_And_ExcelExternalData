package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import util.LectorJson;
import util.ListaNombres;

public class LoadListFromJson implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		ListaNombres.listaJson = LectorJson.cargarJson();		
	}

}
