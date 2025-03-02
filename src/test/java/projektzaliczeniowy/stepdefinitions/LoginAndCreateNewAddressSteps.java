package projektzaliczeniowy.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.PendingException;


import java.time.Duration;
import java.util.List;

public class LoginAndCreateNewAddressSteps {
    private WebDriver driver;


    @Given("I'm on a mystore main page") //wklejamy zawartość kroku
    public void openMystoreMainPage() {
        driver = new ChromeDriver();  //inicjalizujemy driver
        driver.manage().window().maximize(); //maksymalizujemy okienko przeglądarki
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //ustawiamy czas załadowania formularza
        driver.get("https://mystore-testlab.coderslab.pl/"); //przechodzimy na stronę sklepu

    }

    @When("I sign in")
    public void iSignIn() {
        WebElement signInButton = driver.findElement(By.className("user-info"));
        signInButton.click();
    }

    @And("I enter email and password")
    public void iEnterEmailAndPassword() {
        String email = "rfeistppnujilwycig@nbmbb.com";
        String password = "Hasło1234#@!";
        driver.findElement(By.id("field-email")).sendKeys(email);
        driver.findElement(By.id("field-password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).click();
    }

    @Then("I'm successfully logged to My account page")
    public void iMSuccessfullyLoggedToMyAccountPage() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=my-account");

    }

    @And("I go to addresses {string}")
    public void iGoToAddresses(String string) {
        driver.findElement(By.id("addresses-link")).sendKeys();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=addresses");


    }

    @And("I go to Create New Address")
    public void iGoToCreateNewAddress() {
        driver.findElement(By.className("addresses-footer"));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=address");
    }

}




