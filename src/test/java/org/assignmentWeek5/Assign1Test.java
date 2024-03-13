package org.assignmentWeek5;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import testng.Tests;

public class Assign1Test extends Tests {
/*
Go to URL: http://demo.guru99.com/test/drag_drop.html
Drag and drop the BANK button to the Account section in DEBIT SIDE
Drag and drop the SALES button to the Account section in CREDIT SIDE
Drag and drop the 5000 button to the Amount section in DEBIT SIDE
Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
Verify the visibility of Perfect text.
*/@Test
    public void Task1(){
        bot.navigate("http://demo.guru99.com/test/drag_drop.html");
        By bankButton = By.id("credit2");
        By bankDesignation = By.id("bank");
        bot.clickAndHoldDest(bankButton, bankDesignation);

        By salesButton = By.id("credit1");
        By salesDes = By.xpath("//ol[@id='loan']");
           bot.clickAndHoldDest(salesButton,salesDes);
        By button = By.id("fourth");
        By buttonDist=By.id("amt7");
    bot.clickAndHoldDest(button,buttonDist);

        By button2 =By.id("fourth");
        By buttonDist2 = By.id("amt8");
    bot.clickAndHoldDest(button2,buttonDist2);
    Assert.assertTrue(driver.findElement(By.id("equal")).isDisplayed());

    }
}
