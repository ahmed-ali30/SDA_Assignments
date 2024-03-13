package testPackage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

public class cookies extends Tests {
    /**
     * Breakout task: 15 minutes
     * Navigate to <a href="https://kitchen.applitools.com/ingredients/cookie">Cookies</a>
     * print the total number of cookies
     * add a new "fruit=apple" cookie
     * edit the "protein" cookie to have the value "meat"
     * delete the "vegetable" cookie
     * print all cookies
     * delete all cookies
     */@Test
    public void cookitest(){
        driver.navigate().to("https://kitchen.applitools.com/ingredients/cookie");
        System.out.println(driver.manage().getCookies().size());
        driver.manage().getCookies().forEach(System.out::println);;
        driver.manage().addCookie(new Cookie("fruit", "apple"));
        driver.manage().deleteCookieNamed("protein");
        driver.manage().addCookie(new Cookie("protein","meat"));
        driver.manage().deleteCookieNamed("vegetable");
        System.out.println("new list cookies");
        driver.manage().getCookies().forEach(System.out::println);
        driver.manage().deleteAllCookies();
        System.out.println("number"+driver.manage().getCookies().size());
     }
}
