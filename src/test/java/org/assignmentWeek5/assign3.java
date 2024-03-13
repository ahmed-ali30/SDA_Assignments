package org.assignmentWeek5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testng.Tests;

import java.awt.*;
import java.awt.event.KeyEvent;

public class assign3 extends Tests {

    /*
       Go to Amazon
       Scroll to the bottom of the page using a robot
       Click on the "Back to top" web element
       Click on the Amazon logo at the bottom of the page (in the footer) using JavascriptExecutor
       Use Actions to type "ClarusWay" in the search box and perform the search
    */
    @Test
    public void task() throws AWTException, InterruptedException {
    bot.navigate("https://www.amazon.sa/");


        Robot robot = new Robot();


        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            Thread.sleep(500);
        }
        bot.click(By.id("navBackToTop"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement amazonLogo = (WebElement) js.executeScript("return document.getElementById('nav-logo-sprites')");
        amazonLogo.click();
        By searchinput= By.id("twotabsearchtextbox");
        bot.type(searchinput,"ClarusWay"+ Keys.RETURN);

    }
}
