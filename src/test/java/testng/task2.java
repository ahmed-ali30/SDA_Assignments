package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class task2 extends Tests{
    /**
     * Breakout session: 30 minutes
     * navigate to https://practicetestautomation.com/practice-test-login/
     * login using "Username": "student" + "Password": "Password123" (using testdata.json is optional)
     * check that the url is correct "https://practicetestautomation.com/logged-in-successfully/"
     * check the successful login, congratulations message, and logout button are displayed
     */
    @Test
    public void XmlMethod (){
        bot.navigate("https://practicetestautomation.com/practice-test-login/");
        By username = By.id("username");
        By Password = By.id("password");

        bot.type(username,"student");
        bot.type(Password,"Password123");
        bot.click(By.id("submit"));

        SoftAssert Assert = new SoftAssert();

        Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/");
        Assert.assertTrue(driver.findElement(By.className("post-title")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className("has-text-align-center")).isDisplayed());
        //Assert.assertTrue(driver.findElement(By.className("wp-block-group__inner-container is-layout-flow wp-block-group-is-layout-flow")));
    }
}
