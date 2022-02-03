package questions;

import models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.util.List;
import static userinterface.SecurityPage.SPAN_COMPLETE_SETUP;

public class CheckRecord implements Question <Boolean>{
    private List<UserData> userDataList;

    public CheckRecord(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }

    public static CheckRecord verifyRecord(List<UserData> userDataList) {
        return new CheckRecord(userDataList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String title = Text.of(SPAN_COMPLETE_SETUP).answeredBy(actor).toString();
        return userDataList.get(0).getStrCheckEndTitle().equals(title);
    }
}
