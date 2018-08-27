package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class FacebookMainPage extends PageObject{
	
	public static final Target SEARCH_BAR = Target.the("Barra Busqueda").located(By.xpath("//*[@name='q']"));
	public static final Target SEARCH_BUTTON = Target.the("Boton Busqueda").located(By.xpath("//button[@aria-label='Buscar']"));
	public static final Target USERNAME = Target.the("Nombre de Usuario").located(By.xpath("//div[contains(text(),'Alvaro Meza Herazo')]"));
	
	
	public void desactivarNotificacion() {
		getDriver().switchTo().activeElement().sendKeys(Keys.ESCAPE);
	}
	
	public Target selectResult(String name) {
		Target RESULT = Target.the("Resultado").located(By.xpath("//div[contains(text(),'"+name+"')]"));
		return RESULT;
	}
	
	public String getTitle() {
		String title = getDriver().getTitle();
		//System.out.println("Title: "+title);
		return getDriver().getTitle();
	}
}
