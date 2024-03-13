package testPackage;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Create main method
Create chrome driver
Open google home page: https://www.google.com
Print Title on page
Print Current URL on page
Close/Quit the browser
*/
public class task1 {
    WebDriver driver;
    @Test
    public void testGooglePage(){
driver.navigate().to("https://www.google.com");
var title = driver.getTitle();
var currentURL = driver.getCurrentUrl();
        System.out.println("title : "+title);
        System.out.println("Current URL: " + currentURL);

    }

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");

    }
    @AfterEach
    public void afterEach(){

        driver.quit();
    }
}

