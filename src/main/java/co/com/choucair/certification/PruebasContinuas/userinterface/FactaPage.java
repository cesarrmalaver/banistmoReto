package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FactaPage {
    public static final Target PJ_AUTOCERTIFICACION_BUTTON = Target.the("Boton que descarga el pdf").
            located(By.xpath("//*[@id=\"tab1\"]/table/tbody/tr[3]/td[2]/span/a/img"));
}
