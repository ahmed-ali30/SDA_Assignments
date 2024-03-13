package testng;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

public class assign4 extends Tests{
    /*   Go to URL: http://facebook.com
       getCookies,
       addCookie,
       deleteCookieNamed,
       deleteAllCookies
    */
    @Test
    public void task(){
bot.navigate("http://facebook.com");
        driver.manage().getCookies().forEach(System.out::println);;
        driver.manage().addCookie(new Cookie("username", "ahmed"));
        System.out.println("new list cookies: ");
        driver.manage().getCookies().forEach(System.out::println);
        driver.manage().deleteCookieNamed("username");
        System.out.println("new list cookies: ");
        driver.manage().getCookies().forEach(System.out::println);
        driver.manage().deleteAllCookies();
        System.out.println("number of cookies: "+driver.manage().getCookies().size());
    }

}
