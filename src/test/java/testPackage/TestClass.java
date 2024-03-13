package testPackage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

//**
// * initialize the browser in maximized mode (using options)
// * navigate to <a href="https://www.selenium.dev/selenium/web/web-form.html">web form test page</a>
// * check the box and validate that it is checked
// * select the radio and validate that it is selected
// * choose an item (by value) from the select dropdown menu and validate that it is selected (by text)
// */

public class TestClass {
    WebDriver driver;
    @Test
    public void webFormManipulation(){

        By companeyLocator =RelativeLocator.with(By.tagName("td")).toRightOf(By.xpath("//td[contains(.,'Alfreds Futterkiste')]")) ;
        var name = driver.findElement(companeyLocator).getText();
Assertions.assertEquals("Maria Anders",name);
    }
//    public void webFormManipulation(){
//        // writing text
//        By textInput = By.id("user-name");
//        driver.findElement(textInput).sendKeys("standard_user");
//
//
//        By password = By.name("password");
//        driver.findElement(password).sendKeys("secret_sauce");
//
//        By login = RelativeLocator.with(By.tagName("input")).below(password);
//
//        WebElement checkInput=driver.findElement(login);
//        checkInput.click();
//
//
//    }
//
@BeforeEach
    public void beforeEach(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
    // driver.navigate().to("https://www.saucedemo.com/v1/index.html");
}
@AfterEach
    public void afterEach(){
    driver.quit();
}
}