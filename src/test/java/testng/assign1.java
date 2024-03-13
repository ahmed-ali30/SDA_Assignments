package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assign1 extends Tests{
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
        By bankDest = By.id("bank");
        bot.clickAndHoldDest(bankButton,bankDest);

        By salesButton = By.id("credit1");
        By salesDest = By.xpath("//ol[@id='loan']");
           bot.clickAndHoldDest(salesButton,salesDest);
        By button = By.id("fourth");
        By buttonDest=By.id("amt7");
    bot.clickAndHoldDest(button,buttonDest);

        By button2 =By.id("fourth");
        By button2Dest = By.id("amt8");
    bot.clickAndHoldDest(button2,button2Dest);
    Assert.assertTrue(driver.findElement(By.id("equal")).isDisplayed());

    }
}
