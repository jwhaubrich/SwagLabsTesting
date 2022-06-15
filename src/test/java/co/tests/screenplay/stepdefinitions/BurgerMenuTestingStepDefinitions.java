package co.tests.screenplay.stepdefinitions;

import co.tests.screenplay.interactions.DataFiller;
import co.tests.screenplay.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.tests.screenplay.userinterface.HomePage.ABOUT_SECTION;
import static co.tests.screenplay.userinterface.HomePage.BURGER_MENU;
import static co.tests.screenplay.userinterface.LoginPage.LOGIN_BUTTON;

public class BurgerMenuTestingStepDefinitions {

    @Given("I successfully logged into the SwagLabs website")
    public void iSuccessfullyLoggedIntoTheSwagLabsWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Open.url("https://www.saucedemo.com/"),
             DataFiller.fillUserNameAndPassword(Constants.WORKING_USERNAME, Constants.PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }

    @Then("The burger menu was clicked and opens")
    public void theBurgerMenuWasClickedAndOpens() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BURGER_MENU)
        );
    }

    @When("The burger menu was clicked")
    public void theBurgerMenuWasClicked() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BURGER_MENU)
        );
    }

    @Then("the about section was clicked and opens About webpage")
    public void theAboutSectionWasClickedAndOpensAboutWebpage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(ABOUT_SECTION)
        );
    }

}
