package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class OpenUpTheRegisterPage extends PageObject {

    public static final
        Target BUTTON_JOIN_TODAY =
            Target.the("Boton ir a pagina registro")
                .located(By.className("unauthenticated-nav-bar__sign-up"));

}
