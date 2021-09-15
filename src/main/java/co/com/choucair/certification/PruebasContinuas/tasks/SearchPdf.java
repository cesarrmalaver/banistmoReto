package co.com.choucair.certification.PruebasContinuas.tasks;

import co.com.choucair.certification.PruebasContinuas.interactions.SwitchWindows;
import co.com.choucair.certification.PruebasContinuas.userinterface.AprenderEsFacilPage;
import co.com.choucair.certification.PruebasContinuas.userinterface.BanistmoPage;
import co.com.choucair.certification.PruebasContinuas.userinterface.FactaPage;
import co.com.choucair.certification.PruebasContinuas.userinterface.LegalesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchPdf implements Task {

    public static SearchPdf legalInformation() {
        return Tasks.instrumented(SearchPdf.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BanistmoPage.APRENDER_ES_FACIL_BUTTON),
                Click.on(AprenderEsFacilPage.DESCUBRE_MAS_BUTTON),
                Click.on(LegalesPage.FATCA_BUTTON),
                Click.on(FactaPage.PJ_AUTOCERTIFICACION_BUTTON),
                SwitchWindows.setWindow()
        );
    }
}
