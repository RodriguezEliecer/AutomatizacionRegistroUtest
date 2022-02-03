package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.UserData;
import questions.CheckRecord;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static tasks.FillOutDevicesData.registerDevicesData;
import static tasks.FillOutLocationData.registerLocationData;
import static tasks.FillOutPersonalData.registerPersonalData;
import static tasks.FillOutSecurityData.registerSecurityData;
import static tasks.OpenUpTheRegisterPage.theRegisterPage;


public class RegisterUser {

    @Given("he user accessed the url and selected JOIN TODAY")
    public void heUserAccessedTheUrlAndSelectedJOINTODAY() {
        theActorCalled("Daniel").wasAbleTo(
                theRegisterPage());
    }
    @When("^enter the information required by the form$")
    public void enterTheInformationRequiredByTheForm(List<UserData>userDataList) {
        theActorInTheSpotlight().wasAbleTo(
                registerPersonalData(userDataList),
                registerLocationData(userDataList),
                registerDevicesData(userDataList),
                registerSecurityData(userDataList)
        );
    }
    @Then("^registration was successful$")
    public void registrationWasSuccessful(List<UserData>userDataList) {
        theActorInTheSpotlight().should(seeThat(
                CheckRecord.verifyRecord(userDataList)
        ));
    }
}
