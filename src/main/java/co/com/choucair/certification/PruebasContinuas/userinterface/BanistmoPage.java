package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BanistmoPage {

    public static final Target APRENDER_ES_FACIL_BUTTON = Target.the("Boton aprender es facil").
            located(By.xpath("//a[contains (text (), 'Aprender es Fácil')]"));

}
