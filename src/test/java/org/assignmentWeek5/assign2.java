package org.assignmentWeek5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import testng.Tests;

public class assign2 extends Tests {

//   ( This task should be managed with keyboard actions )
// go to https://www.google.com/
// search for "Scroll Methods" by using an Actions object
//*/
    @Test
public void searchGoogle(){
    bot.navigate("https://www.google.com/");
        new Actions(driver)
                .sendKeys(driver.findElement(By.id("APjFqb")), "Scroll Methods")
                .perform();
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
}
}
