package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AprenderEsFacilPage {

    public static final Target DESCUBRE_MAS_BUTTON = Target.the("Boton descubre mas").
            located(By.xpath("(//a[contains (text (), 'Descubre más')])[3]"));


}
