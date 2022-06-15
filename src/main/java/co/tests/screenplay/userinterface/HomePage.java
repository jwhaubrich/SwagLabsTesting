package co.tests.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BURGER_MENU = Target.the("Burger menu").located(By.id("react-burger-menu-btn"));
    public static final Target ABOUT_SECTION = Target.the("About section").located(By.id("about_sidebar_link"));
}
