
package testPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.WebElement;

public class task5 {
    WebDriver driver;
    ////Task 2:
//     * breakout task: (in a separate class)
//        * navigate to this url https://www.saucedemo.com/v1/inventory.html
//        * add the first item you find to your cart
//     * open your cart*
//        * assert that the item name is correct inside the cart
    @Test
    public void part1(){
        driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
        driver.findElement(By.xpath("(//*[@class=\"btn_primary btn_inventory\"])[1]")).click();
        driver.navigate().to("https://www.saucedemo.com/v1/cart.html");

        var item = driver.findElement(By.xpath("//*[@class=\"inventory_item_name\"]")).getText();
        Assertions.assertEquals("Sauce Labs Backpack",item);




    }

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();


    }
    @AfterEach
    public void afterEach(){

        driver.quit();
    }
}