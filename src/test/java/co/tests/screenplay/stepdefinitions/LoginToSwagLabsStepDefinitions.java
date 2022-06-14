package co.tests.screenplay.stepdefinitions;

import co.tests.screenplay.interactions.FillUNameAndPassword;
import co.tests.screenplay.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.Keys;

import static co.tests.screenplay.userinterface.LoginPage.userNameTextBox;

public class LoginToSwagLabsStepDefinitions {
    @Given("I navigated to the Swag Labs website")
    public void iNavigatedToTheSwagLabsWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    @When("Correct username and password combination are entered")
    public void iEnteredCorrectUsernameAndPasswordCombination() {
//        for(int i = 0; Constants.NUMBER_OF_USERNAMES > i; i++){
//            FillUNameAndPassword.fillUNameAndPassword(Constants.userNameList[i],Constants.PASSWORD);
//            Open.url("https://www.saucedemo.com/");
//        }
        //FillUNameAndPassword.fillUNameAndPassword(Constants.USERNAME1, Constants.PASSWORD);
        Enter.keyValues("standard_user").into(userNameTextBox).thenHit(Keys.TAB);
    }

    @Then("I am logged into the website")
    public void iAmLoggedIntoTheWebsite() {
    }
}
