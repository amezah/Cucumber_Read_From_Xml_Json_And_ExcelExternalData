package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import util.LectorXML;
import util.ListaNombres;

public class LoadListFromXml implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		ListaNombres.listaXml = LectorXML.leer();
		System.out.println("Size: "+ListaNombres.listaXml.size());
		
	}

}
