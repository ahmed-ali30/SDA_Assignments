package testPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// Invoke Chrome Browser
// Navigate to URL: https://www.w3schools.com/
// Navigate to URL: https://stackoverflow.com/
// Come back to the w3schools using the back command.
// Again go back to the stackoverflow website using forward command
// Refresh the Browser using refresh command.
// Close the Browser.


//second assignment part02
// Expected Title
// Set Path of the Chrome driver
// Launch Chrome browser
// Open URL of Website
// Maximize Window
// Get Title of current Page
// Validate/Compare Page Title
// Close Browser (edited) (edited)
public class task2 {
    WebDriver driver;
    @Test
    public void part1(){
        driver.navigate().to("https://www.w3schools.com/");
        driver.navigate().to("https://stackoverflow.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
//


    }
    @Test
    public void part2(){
        driver.navigate().to("https://stackoverflow.com/");
        driver.manage().window().maximize();
        var title = driver.getTitle();
        Assertions.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build Careers",title);
        driver.quit();
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