package co.tests.screenplay.stepdefinitions;

import co.tests.screenplay.interactions.FillUserNameAndPassword;
import co.tests.screenplay.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.tests.screenplay.userinterface.LoginPage.LOGIN_BUTTON;

public class ValidLoginStepDefinitions {
    @Given("I navigated to the Swag Labs website")
    public void iNavigatedToTheSwagLabsWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    @When("Correct username and password combination are entered")
    public void iEnteredCorrectUsernameAndPasswordCombination() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            FillUserNameAndPassword.fillUserNameAndPassword(Constants.WORKING_USERNAME,Constants.PASSWORD)
        );
    }

    @Then("I am logged into the website")
    public void iAmLoggedIntoTheWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(
        Click.on(LOGIN_BUTTON)
        );
    }

}
