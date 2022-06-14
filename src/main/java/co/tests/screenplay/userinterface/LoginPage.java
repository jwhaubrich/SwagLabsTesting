package co.tests.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME_TEXT_BOX = Target.the("Username text box").located(By.id("user-name"));
    public static final Target PASSWORD_TEXT_BOX = Target.the("Password text box").located((By.id("password")));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.id("login-button"));
}



