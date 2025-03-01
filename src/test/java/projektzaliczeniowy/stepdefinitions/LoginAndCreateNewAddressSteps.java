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

import java.time.Duration;

public class LoginAndCreateNewAddressSteps {
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

    @And("I enter email {email} and password {password}")
    public void iEnterEmailEmailAndPasswordPassword() {
        String email = "rfeistppnujilwycig@nbmbb.com";
        String password = "Hasło1234#@!";
        driver.findElement(By.id("field-email")).sendKeys(email);
        driver.findElement(By.id("field-password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).click();
    }


    @Then("I'm on Your account page")
    public void iMOnYourAccountPage() {
        // Używamy WebDriverWait do oczekiwania na elementy na stronie
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        // Czekamy, aż element konta będzie widoczny
        WebElement accountPageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("account")));



    }

    @And("I click to addresses tile on page")
    public void iClickToAddressesTileOnPage() {
        driver.findElement(By.className("link-item")).click();
    }


    @Then("I click {string}")
    public void iClickCreateNewAddress() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=addresses");

    }



    @And("I close browser")
    public void iCloseBrowser() {
        driver.quit();
    }

}


