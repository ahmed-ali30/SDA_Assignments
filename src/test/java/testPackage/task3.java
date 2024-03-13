package testPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class task3 {
    WebDriver driver;
    //First
    //Navigate to https://testpages.herokuapp.com/styled/index.html
//Click on Simple Calculator under Micro Apps.
//Type any number in the first input.
//Type any number in the second input.
//Click on Calculate.
//Get the result.
//Print the result.
    @Test
    public void part1(){
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement checkInput=driver.findElement(By.id("calculatetest"));
        checkInput.click();
        By textInput = By.id("number1");
        driver.findElement(textInput).sendKeys("13");
        By textInput2 = By.id("number2");
        driver.findElement(textInput2).sendKeys("109");
        driver.findElement(By.id("calculate")).click();
        System.out.println(driver.findElement(By.id("answer")).getText());

    }


    ////second
//Go to URL: https://www.linkedin.com/
//Locate the "Email or phone", "password", "Sign in" button using absolute xpath and relative xpath
    @Test
    public void part2(){
        driver.navigate().to("https://www.linkedin.com/");

        By textInput = By.xpath("//*[@id=\"session_key\"]");
        driver.findElement(textInput).sendKeys("AhmedALi@mmnc");
        By textInput2 = By.xpath("//*[@id=\"session_password\"]");
        driver.findElement(textInput2).sendKeys("@13e2edvv");
        WebElement checkInput=driver.findElement(By.xpath("//button[contains(.,\"Sign in\")]"));
        checkInput.click();


    }
    ////third
//
//find the locators of webelements on page https://www.linkedin.com/
//id, name, className, linkText, PLinkText
@Test

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();


    }
    @AfterEach
    public void afterEach(){

        driver.quit();
    }
}