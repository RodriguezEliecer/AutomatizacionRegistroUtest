package tasks;

import models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


import java.util.List;

import static userinterface.LocationPage.*;

public class FillOutLocationData implements Task {
    private List<UserData> userDataList;

    public FillOutLocationData(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userDataList.get(0).getStrCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ENTER).into(INPUT_CITY),
                Enter.theValue(userDataList.get(0).getStrZIP()).into(INPUT_ZIP),
                Click.on(DIV_COUNTRY),
                Enter.theValue(userDataList.get(0).getStrCountry()).into(INPUT_COUNTRY),
                Click.on(BUTTON_NEXT)

        );
    }
    public static FillOutLocationData registerLocationData(List<UserData> userDataList) {
        return Tasks.instrumented(FillOutLocationData.class, userDataList);
    }
}
