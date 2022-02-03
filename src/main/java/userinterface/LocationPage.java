package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage extends PageObject {
    public static final
        Target INPUT_CITY =
            Target.the("City")
                .located(By.xpath("//input[@id='city']"));

    public static final
        Target INPUT_ZIP =
            Target.the("ZIP")
                .located(By.id("zip"));

    public static final
        Target INPUT_COUNTRY =
            Target.the("Country")
                .located(By.xpath("//input[@placeholder='Select a country']"));

    public static final
    Target DIV_COUNTRY =
            Target.the("Div Country")
                    .located(By.xpath("//div[@placeholder='Select a country']"));

    public static final
        Target BUTTON_NEXT =
            Target.the("Boton ir a los siguientes campos ")
                .located(org.openqa.selenium.By.xpath("//a[@class='btn btn-blue pull-right']"));

}
