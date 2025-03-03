package projektzaliczeniowy.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;


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
        signInButton.click(); //Klikamy przycisk logowania
    }

    @And("I enter email and password")
    public void iEnterEmailAndPassword() {
        String email = "rfeistppnujilwycig@nbmbb.com";
        String password = "Hasło1234#@!";
        driver.findElement(By.className("form-control")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userInfo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("user-info")));
        assertTrue(userInfo.isDisplayed());
    }

    @And("I go to addresses button")
    public void iGoToAddressesButton() {
        driver.findElement(By.id("addresses-link")).click(); //Klikamy przycisk, który przenosi nas do sekcji adresów
    }

    @And("I click Create New Address")
    public void iClickCreateNewAddress() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=address");

    }

//    @And("I fill in the form with {string}, {string}, {string}, {string}, {string}, {string}")
//    public void iFillInTheFormWith(String alias, String address, String city, String postcode, String country, String phone) {
//        driver.findElement(By.id("field-alias")).sendKeys(alias);
//        driver.findElement(By.id("field-city")).sendKeys(city);
//        driver.findElement(By.id("field-postcode")).sendKeys(postcode);
//        driver.findElement(By.id("field-id_country")).sendKeys(country);
//        driver.findElement(By.id("field-phone")).sendKeys(phone);

    }

