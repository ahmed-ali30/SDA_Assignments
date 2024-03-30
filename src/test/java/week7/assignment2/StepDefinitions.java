package week7.assignment2;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinitions {
    private WebDriver driver;

    @Given("user goes to the {string}")
    public void userGoesToThePageUrl(String pageUrl) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(pageUrl);
    }

    @Then("user waits for {int} seconds")
    public void userWaitsForSeconds(int seconds) throws InterruptedException {
        // Wait for the specified number of seconds
        Thread.sleep(5000);
    }

    @Then("verifies that the page title contains the word {string}")
    public void verifiesThatThePageTitleContainsTheWord(String title) {
        String pageTitle = driver.getTitle();
       // Assertions.assertTrue(driver.getTitle().contains(title));
        assert pageTitle.contains(title) : "Page title does not contain the word '" + title + "'";
    }

    @Then("closes the page")
    public void closesThePage() {
        // Close the browser
        driver.quit();
    }

}
