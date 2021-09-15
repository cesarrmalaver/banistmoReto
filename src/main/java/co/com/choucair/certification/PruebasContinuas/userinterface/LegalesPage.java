package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LegalesPage {

    public static final Target FATCA_BUTTON = Target.the("Boton Fatca & Crs").
            located(By.xpath("(//a[contains (text (), 'Conoce más')])[2]"));

}
