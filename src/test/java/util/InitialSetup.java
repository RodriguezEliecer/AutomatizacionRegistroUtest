package util;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class InitialSetup {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
