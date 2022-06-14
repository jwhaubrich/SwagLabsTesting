package co.tests.screenplay.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ActorConfig {

    @Before
    public void actorConfig(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Joe");
    }
}
