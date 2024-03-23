package week6;

import org.testng.annotations.Test;
import testng.Tests;

public class assignment1Tests extends Tests {
    /*
    Create tests that depend on each other
    Create beforeClass and set up settings.
    By creating interdependent tests;
    First go to Facebook.
    Then go to Google depending on Facebook,
    Then go to Amazon depending on Google
    Close the driver.
     */


    @Test
    public void facebookTest(){
        bot.navigate("https://www.facebook.com/");
    }
    @Test(dependsOnMethods = {"facebookTest"})
    public void googleTest(){
        bot.navigate("https://www.google.com");
    }
    @Test(dependsOnMethods = {"googleTest"})
    public void amazonTest(){
        bot.navigate("https://www.amazon.com");
    }
}
