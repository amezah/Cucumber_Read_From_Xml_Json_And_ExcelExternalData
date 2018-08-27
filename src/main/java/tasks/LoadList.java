package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import util.ListaNombres;
import util.PerfilCRUD;

public class LoadList implements Task{
	
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		ListaNombres.lista = new PerfilCRUD().listar();	
		System.out.println("Size: "+ListaNombres.lista.size());
	}

}
