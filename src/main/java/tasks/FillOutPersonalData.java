package tasks;

import models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static userinterface.PersonalPage.*;

public class FillOutPersonalData implements Task {
    private List<UserData> userDataList;

    public FillOutPersonalData(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userDataList.get(0).getStrFirstName()).into(NOMBRE),
                Enter.theValue(userDataList.get(0).getStrLastName()).into(APELLIDO),
                Enter.theValue(userDataList.get(0).getStrEmail()).into(CORREO),
                SelectFromOptions.byVisibleText(userDataList.get(0).getStrBirthMonth()).from(MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(userDataList.get(0).getStrBirthDay()).from(DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(userDataList.get(0).getStrBirthYear()).from(ANIO_NACIMIENTO),
                Click.on(BOTON_SIGUIENTE)
        );
    }
    public static FillOutPersonalData registerPersonalData(List<UserData> userDataList) {
        return Tasks.instrumented(FillOutPersonalData.class,userDataList);
    }
}
