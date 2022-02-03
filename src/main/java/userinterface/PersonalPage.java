package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalPage extends PageObject {
    public static final
        Target NOMBRE =
            Target.the("Input Nombre del Usuario")
                .located(By.id("firstName"));
    public static final
        Target APELLIDO =
            Target.the("Input Apellido del Usuario")
                .located(By.id("lastName"));
    public static final
        Target CORREO =
            Target.the("Input Correo del Usuario")
                .located(By.id("email"));
    public static final
        Target MES_NACIMIENTO =
            Target.the("Input Mes de Nacimiento del Usuario")
                .located(By.id("birthMonth"));
    public static final
        Target DIA_NACIMIENTO =
            Target.the("Input Dia de Nacimiento del Usuario")
                .located(By.id("birthDay"));
    public static final
        Target ANIO_NACIMIENTO =
            Target.the("Input Anio de Nacimeito del Usuario")
                .located(By.id("birthYear"));
    public static final
        Target IDIOMA =
            Target.the("Input Idiona del Usuario")
                .located(By.xpath("//input[@class='ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched']"));
    public static final
        Target BOTON_SIGUIENTE =
            Target.the("Boton Siguiente del formulario")
                .located(By.xpath("//a[@class='btn btn-blue']"));
}
