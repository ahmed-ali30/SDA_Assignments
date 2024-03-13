package testPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.WebElement;


//        *///Task 1:
////Go to URL: https://demoqa.com/radio-button
////Verify whether all 3 options given to the question can be selected.
////When each option is selected, print the following texts on the console.
////
public class task4 {
    WebDriver driver;
    @Test
    public void part1(){
        driver.navigate().to("https://demoqa.com/radio-button");

        By radioButtonsLocator = By.className("custom-control-label");
        var radioButtons = driver.findElements(radioButtonsLocator);

        for (WebElement radioButton : radioButtons) {
            radioButton.click();
            System.out.println("Selected option: " + radioButton.getText());
        }
    }

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();


    }
    @AfterEach
    public void afterEach(){

        driver.quit();
    }
}