package testPackage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

//Go to URL: http://demo.guru99.com/test/guru99home/
//Find the number of iframes on the page.
//Link to the third iframe (JMeter Made Easy) (https://www.guru99.com/live-selenium-project.html) click here.
//Exit the iframe and return to the main page.
//
public class assignment3 extends Tests{
    @Test
    public void task(){
        driver.navigate().to(" http://demo.guru99.com/test/guru99home/");

        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        int iframeCount = iframes.size();
        System.out.println("Number of iframes on the page: " + iframeCount);

     //  WebElement iframe = driver.findElement(By.xpath("//iframe[@name='a077aa5e']"));
        //the frame in the webpage is the 6 index
       WebElement iframe =iframes.get(6);
//        for(WebElement iframe:iframes){
//            String frameid =  iframe.getAttribute("id");
//            System.out.println(frameid);
//        }
        //System.out.println(frameid);
        driver.switchTo().frame(iframe);
        var headerText = driver.findElement(By.tagName("a")).getAttribute("href");
        System.out.println(headerText);
        WebElement link = driver.findElement(By.tagName("a"));
        var originalWindowHandle = driver.getWindowHandle();
        new Actions(driver)
                .click(link)
                .perform();
        driver.switchTo().defaultContent();
        driver.switchTo().window(originalWindowHandle);
    }

}
