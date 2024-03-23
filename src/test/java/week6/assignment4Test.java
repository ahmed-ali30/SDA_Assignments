package week6;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class assignment4Test extends Tests{
    /*
        //Open the site: http://opencart.abstracta.us/index.php?route=account/login
        //Login with that credentials
        //Email: clarusway@gmail.com
        //Password: 123456789
        //Using the Search function do it with Data Provider for Mac, iPad and Samsung.
     */
    @Test(dataProvider = "searchitem")
    public void task(String[] searchitem){
       bot.navigate("http://opencart.abstracta.us/index.php?route=account/login");
       bot.type(By.id("input-email"),"clarusway@gmail.com");
       bot.type(By.id("input-password"),"123456789");
       bot.click(By.xpath("//input[@type='submit']"));
       for (String item:searchitem){
           bot.type(By.xpath("//input[@type='text']"),item);
           bot.click(By.cssSelector("div#search>span>button"));
       }

    }
    @DataProvider
    private Object[] searchitem (){
        Object [] opject =new Object[1];
        String [] searchitem =new String[3];
        searchitem[0]="Mac";
        searchitem[1]="ipad";
        searchitem[2]="Samsung";

        opject[0]=searchitem;

return opject;
    }
}
