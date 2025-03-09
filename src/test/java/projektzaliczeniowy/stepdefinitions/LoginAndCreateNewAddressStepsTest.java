package projektzaliczeniowy.stepdefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/Features",
        //glue = "projektzaliczeniowy.stepdefinitions",
        plugin = {"pretty", "html:out"}  // Pluginy do generowania raportu HTML
)
public class LoginAndCreateNewAddressStepsTest {

    }

