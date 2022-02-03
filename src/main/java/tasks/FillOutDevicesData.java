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
import static userinterface.DevicesPage.*;

public class FillOutDevicesData implements Task {
    private List<UserData> userDataList;

    public FillOutDevicesData(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }

    public static FillOutDevicesData registerDevicesData(List<UserData> userDataList) {
        return Tasks.instrumented(FillOutDevicesData.class,userDataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DIV_COMPUTER),
                Enter.theValue(userDataList.get(0).getStrDevComputer()).into(INPUT_COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(INPUT_COMPUTER),

                Click.on(DIV_VERSION),
                Enter.theValue(userDataList.get(0).getStrDevVersion()).into(INPUT_VERSION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_VERSION),
                Hit.the(Keys.ENTER).into(INPUT_VERSION),

                Click.on(DIV_LANGUAGE),
                Enter.theValue(userDataList.get(0).getStrDevLanguage()).into(INPUT_LANGUAGE),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE),

                Click.on(DIV_MOBILE),
                Enter.theValue(userDataList.get(0).getStrDevMobile()).into(INPUT_MOBILE),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_MOBILE),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE),

                Click.on(DIV_MODEL),
                Enter.theValue(userDataList.get(0).getStrDevModel()).into(INPUT_MODEL),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_MODEL),
                Hit.the(Keys.ENTER).into(INPUT_MODEL),

                Click.on(DIV_OS),
                Enter.theValue(userDataList.get(0).getStrDevOs()).into(INPUT_OS),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_OS),
                Hit.the(Keys.ENTER).into(INPUT_OS),

                Click.on(BUTTON_NEXT)
        );
    }
}
