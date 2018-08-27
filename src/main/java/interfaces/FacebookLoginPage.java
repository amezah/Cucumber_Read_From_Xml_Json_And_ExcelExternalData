package interfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.facebook.com/")
public class FacebookLoginPage extends PageObject{
	
	public static final Target USER_FIELD = Target.the("Campo Usuario").located(By.xpath("//input[@id='email']"));
	public static final Target PASSWORD_FIELD = Target.the("Campo Contraseña").located(By.xpath("//input[@id='pass']"));
	public static final Target LOGIN_BUTTON = Target.the("Boton Iniciar Sesion").located(By.xpath("//*[@id=\"loginbutton\"]"));
	

}

