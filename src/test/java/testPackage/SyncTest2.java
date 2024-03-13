package testPackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Breakout task: 15 minutes
 * Navigate to <a href="https://the-internet.herokuapp.com/javascript_alerts">Alerts</a>
 * click on "Click for JS Confirm"
 * Press OK
 * Check that "You clicked: Ok" is displayed
 */
public class SyncTest2 extends Tests {

        @Test
        public void alertTest(){
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        By button = By.cssSelector("button[onclick =\"jsConfirm()\"]");
        driver.findElement(button).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

                //Store the alert text in a variable
                String text = alert.getText();

                //Press the OK button
                alert.accept();
                Assertions.assertEquals("I am a JS Confirm", text);
        }
        @Test
        public void iframe(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/click_frames.html");
                //Store the web element
                WebElement iframe = driver.findElement(By.name("source"));

//Switch to the frame
                driver.switchTo().frame(iframe);

//Now we can click the button
              var text = driver.findElement(By.tagName("h1")).getText();
                Assertions.assertEquals("Testing Clicks",text);
        }


}
