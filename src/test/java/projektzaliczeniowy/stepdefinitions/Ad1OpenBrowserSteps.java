package projektzaliczeniowy.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class Ad1OpenBrowserSteps {
    WebDriver driver = new ChromeDriver();

    @Given("an open browser with google.com")
    public void openBrowserWithGoogle() {
        // Otwarcie przeglądarki i przejście na stronę google.com
        driver.get("https://www.google.com");
    }

    @When("a keyword {string} is entered in input field")
    public void enterKeywordInInputField(String keyword) {
        // Znalezienie pola wyszukiwania po nazwie i wpisanie słowa kluczowego
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword);  // Wpisanie słowa kluczowego
        searchBox.submit();  // Wysłanie formularza
    }

    @Then("the first one should contain {string}")
    public void checkFirstResultContainsExpectedWord(String expectedWord) {
        // Czekamy na załadowanie wyników wyszukiwania (można tu dodać np. WebDriverWait)
        WebElement firstResult = driver.findElement(By.cssSelector("h3"));
        assertTrue("The first result does not contain the expected word",
                firstResult.getText().contains(expectedWord));
    }

    @And("close browser")
    public void closeBrowser() {
        // Zamknięcie przeglądarki po zakończeniu testu
        driver.quit();
    }
}
