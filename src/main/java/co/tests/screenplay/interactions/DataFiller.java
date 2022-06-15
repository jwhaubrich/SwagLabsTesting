package co.tests.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.tests.screenplay.userinterface.LoginPage.PASSWORD_TEXT_BOX;
import static co.tests.screenplay.userinterface.LoginPage.USERNAME_TEXT_BOX;

//have the different usernames to enter in inside this class as a string list?
//you don't want the user to have the option of entering things into the textbox
//does it make sense to have them all inside the same class?

public class DataFiller implements Interaction {
    private String userName;
    private String password;

    public DataFiller(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(userName).into(USERNAME_TEXT_BOX),
                Enter.theValue(password).into(PASSWORD_TEXT_BOX)
        );

    }

    public static DataFiller fillUserNameAndPassword(String userName, String password){
        return Tasks.instrumented(DataFiller.class, userName, password);
    }
}
