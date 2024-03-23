package week6;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assignment3Test extends Tests {
    /*✅
        go to "https://practicetestautomation.com/practice-test-login/"
        enter username - "student"
        enter password - "incorrectPassword"
        and login
        SOFT ASSERT the error message shown
        SOFT ASSERT the error message is "Your password is invalid!"
     */
    @Test
    public void task(){
        bot.navigate("https://practicetestautomation.com/practice-test-login/");
        bot.type(By.id("username"),"student");
        bot.type(By.id("password"),"incorrectPassword");
        bot.click(By.id("submit"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.findElement(By.id("error")).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.id("error")).getText(),"Your password is invalid!");
        softAssert.assertAll();
    }
}
