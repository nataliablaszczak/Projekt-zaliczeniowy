package projektzaliczeniowy.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ad2LoginSteps {
    private WebDriver driver;

    @Given("I'm on a mystore main page") //wklejamy zawartość kroku
    public void openMystoreMainPage() {
      driver = new ChromeDriver();  //inicjalizujemy driver
      driver.manage().window().maximize(); //maksymalizujemy okienko przeglądarki
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //ustawiamy czas załadowania formularza
      driver.get("https://mystore-testlab.coderslab.pl/"); //przechodzimy na stronę sklepu

    }

    @When("I sign in")
    public void iSignIn() {
        WebElement signInButton = driver.findElement(By.className("user-info"));
        signInButton.click();
    }

    @And("I enter email {string} and password {string}")
    public void iEnterEmailAndPassword() {
        String email = "rfeistppnujilwycig" + "@nbmbb.com";
        String password = "Hasło1234#@!";
        driver.findElement(By.id("field-email")).sendKeys(email);
        driver.findElement(By.id("field-password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).click();



    }


    @Then("I'm on Your account page")
    public void iMOnYourAccountPage() {
        // Używamy WebDriverWait do oczekiwania na elementy na stronie
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Czekamy, aż element konta będzie widoczny
        WebElement accountPageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("account")));
    }

    @And("I close browser")
    public void iCloseBrowser() {
        driver.quit();
    }
}

