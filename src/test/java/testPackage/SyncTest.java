package testPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class SyncTest {
    WebDriver driver;
    Wait<WebDriver> wait;



    @BeforeEach
    public void beforeEach(){
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("start-maxmized");
//        driver = new ChromeDriver(chromeOptions);

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new FirefoxDriver(firefoxOptions);

    }
    @Test
    public void synctest() throws InterruptedException {
        driver.navigate().to("https://www.google.com");
        By searchtext = By.id("APjFqb");
        driver.findElement(searchtext).sendKeys("Selenium"+ Keys.RETURN);
        //Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver , Duration.ofSeconds(5));

        wait.until(d -> !driver.findElement(By.id("result-stats")).getText().isEmpty());
        var res = driver.findElement(By.id("result-stats")).getText();

        Assertions.assertNotEquals("",res);
    }

    @AfterEach
    public void afterEach(){

        driver.quit();
    }

}
