package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class GoogleTest extends Tests{
    @Parameters({ "search_q" })
    @Test
    public void Searchtest(String Search_q){
        bot.navigate("https://www.google.com/");
        By searchinput = By.cssSelector("#APjFqb") ;
        String Search = Search_q;
        bot.type(searchinput,Search+ Keys.RETURN);

       By result =By.cssSelector( "div#result-stats");
       //assert !driver.findElement(result).getText().isEmpty();
        Assert.assertFalse(driver.findElement(result).getText().isEmpty());
    }
}
