package testPackage;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//Breakout task: 20 minutes
//navigate to https://www.selenium.dev/selenium/web/droppableItems.html
//drag the draggable, onto the droppable
//check that the text now shows "Dropped!"
public class drobable extends Tests{

    @Test
    public void drob(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/droppableItems.html");
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        new Actions(driver)
                .dragAndDrop(draggable, droppable)
                .perform();

        Assertions.assertEquals("Dropped!",droppable.getText());
    }
//    navigate to: https://rangeslider.js.org/
//    scroll to the right until you reach 700
//            assert that the number says 700
    @Test
    public void slider(){
driver.navigate().to("https://rangeslider.js.org/");
        WebElement tracker = driver.findElement(By.className("rangeslider__handle"));
        new Actions(driver)
                .clickAndHold(tracker)
                .moveByOffset(210,0)
                .perform();

        Assertions.assertEquals("700",driver.findElement(By.id("js-output")).getText());

    }
}
