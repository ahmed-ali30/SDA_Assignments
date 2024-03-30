package week7.assignments;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import week7.pages.regester;

public class stepDef {
    WebDriver driver;
    regester registrationPage = new regester();

    @Given("user go to Ecommerce.com")
    public void userGoToEcommerceCom() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
    }

    @And("user register with fluent page opject")
    public void userRegisterWithFluentPageOpject() {

        // Enter first name
        registrationPage.enterfirstname("ahmed", driver);

        // Enter last name
        registrationPage.enterlastname("ali", driver);

        // Enter email
        registrationPage.enterEmail("Ahmed.Ali@x.com", driver);

        // Enter telephone
        registrationPage.enterTelephone("1234567890", driver);

        // Enter password
        registrationPage.enterPassword("password123", driver);

        // Confirm password
        registrationPage.enterConfirmPassword("password123", driver);

        // Select subscribe
        registrationPage.selectSubscribe(driver);

        // Select agree
        registrationPage.selectAgree(driver);

        // Submit form
        registrationPage.submitForm(driver);
    }

    @Then("the user shold receve a confermation label")
    public void theUserSholdReceveAConfermationLabel() {
        Assertions.assertEquals(  "Your Account Has Been Created!",registrationPage.checkAccountCreated(driver));
    }
    @AfterAll
    public void terminate(){
        driver.quit();
    }
}
