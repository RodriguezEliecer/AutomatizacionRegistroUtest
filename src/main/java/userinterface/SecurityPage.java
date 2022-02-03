package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecurityPage extends PageObject {

    public static final
        Target INPUT_PASSWORD=
            Target.the("Input password")
                    .located(By.id("password"));

    public static final
        Target INPUT_CONFIRM_PASSWORD =
            Target.the("Input password confirm")
                    .located(By.id("confirmPassword"));

    public static final
        Target CHECKBOX_STAY_INFORMED  =
            Target.the("checkbox stay informed")
                    .located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));

    public static final
        Target CHECKBOX_TERMS_0F_USE =
            Target.the("checkbox terms of use")
                    .located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));

    public static final
        Target CHECKBOX_PRIVACY_SECURITY_POLICY =
            Target.the("checkbox privacy security policy")
                    .located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));

    public static final
        Target BUTTON_COMPLETE_SETUP =
            Target.the("Button complete setup")
                    .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final
    Target SPAN_COMPLETE_SETUP =
            Target.the("Span complete setup")
                    .located(By.xpath("//*[@id='laddaBtn']/span"));


}
