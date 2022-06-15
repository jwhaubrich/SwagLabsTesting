package co.tests.screenplay.stepdefinitions;

import co.tests.screenplay.interactions.DataFiller;
import co.tests.screenplay.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.tests.screenplay.userinterface.LoginPage.LOGIN_BUTTON;

public class ValidInvalidLoginStepDefinitions {
    @Given("I navigated to the SwagLabs website")
    public void iNavigatedToTheSwagLabsWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    @When("Correct username and password combination are entered")
    public void iEnteredCorrectUsernameAndPasswordCombination() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            DataFiller.fillUserNameAndPassword(Constants.WORKING_USERNAME,Constants.PASSWORD)
        );
    }

    @Then("I am logged into the website")
    public void iAmLoggedIntoTheWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(
        Click.on(LOGIN_BUTTON)
        );
    }


    @When("User entered correct username and password but is locked out")
    public void userEnteredCorrectUsernameAndPasswordButIsLockedOut() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DataFiller.fillUserNameAndPassword(Constants.LOCKED_OUT_USER, Constants.PASSWORD)
        );
    }

    @Then("Error was displayed")
    public void errorWasDisplayed() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(LOGIN_BUTTON)
        );
    }

}
