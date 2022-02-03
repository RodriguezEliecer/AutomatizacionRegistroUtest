package tasks;

import models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterface.SecurityPage.*;

public class FillOutSecurityData implements Task {
    private List<UserData> userDataList;

    public FillOutSecurityData(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }

    public static FillOutSecurityData registerSecurityData(List<UserData> userDataList) {
        return Tasks.instrumented(FillOutSecurityData.class,userDataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userDataList.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(userDataList.get(0).getStrConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECKBOX_STAY_INFORMED),
                Click.on(CHECKBOX_TERMS_0F_USE),
                Click.on(CHECKBOX_PRIVACY_SECURITY_POLICY),
                Click.on(BUTTON_COMPLETE_SETUP)
        );
    }
}
