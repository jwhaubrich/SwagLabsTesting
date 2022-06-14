package co.tests.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.tests.screenplay.userinterface.LoginPage.USERNAME_TEXT_BOX;

//have the different usernames to enter in inside this class as a string list?
//you don't want the user to have the option of entering things into the textbox
//does it make sense to have them all inside the same class?

public class FillUNameAndPassword implements Interaction {
    private String userName;
    private String password;

    public FillUNameAndPassword(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            Enter.theValue(userName).into(USERNAME_TEXT_BOX)
//            Enter.theValue(password).into(passwordTextBox)
                );
    }

    public static FillUNameAndPassword fillUNameAndPassword(String userName, String password){
        return Tasks.instrumented(FillUNameAndPassword.class, userName, password);
    }
}
