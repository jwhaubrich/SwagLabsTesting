package co.tests.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target userNameTextBox = Target.the("Username text box").locatedBy("//*[@id=\"user-name\"]");
    public static final Target passwordTextBox = Target.the("Password text box").located((By.id("password")));
}



