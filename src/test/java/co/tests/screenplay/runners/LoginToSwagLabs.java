package co.tests.screenplay.runners;

import io.cucumber.junit.*;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/valid_invalid_login.feature",
        glue = "co.tests.screenplay.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class LoginToSwagLabs { }
