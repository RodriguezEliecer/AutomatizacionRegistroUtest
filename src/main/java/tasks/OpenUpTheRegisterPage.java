package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static userinterface.OpenUpTheRegisterPage.*;
public class OpenUpTheRegisterPage implements Task {

    private userinterface.OpenUpTheRegisterPage paginaUtest;
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Open.browserOn(paginaUtest),
               Click.on(BUTTON_JOIN_TODAY)
       );
    }
    public static OpenUpTheRegisterPage theRegisterPage() {
        return Tasks.instrumented(OpenUpTheRegisterPage.class);
    }
}
