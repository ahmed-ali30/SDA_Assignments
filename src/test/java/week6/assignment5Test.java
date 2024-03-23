package week6;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assignment5Test extends Tests{
    /*
     //Go to URL: http://crossbrowsertesting.github.io/
     //Click to To-Do App
     //Checking Box to do-4 and Checking Box to do-5
     //If both clicks worked, then the following List should be have length 3.
     //Assert that this is correct
     //Assert that the to do we added is present in the list
     //Archiving old todos
     //If our archive link worked, then the following list should have length 4.
     //Assert that this is true as well
     //Doing Cross Browser Testing.
  */
    @Test
    public void task (){
    bot.navigate("http://crossbrowsertesting.github.io/");
    bot.click(By.linkText("To-Do App"));
    bot.click(By.name("todo-4"));
    bot.click(By.name("todo-5"));
    Assert.assertEquals("3 of 5 remaining", bot.getText(By.xpath("//span[@class='ng-binding']")));
    bot.click(By.linkText("archive"));
    Assert.assertEquals(3,driver.findElements(By.tagName("li")).size());
//test
    bot.type(By.id("todotext"),"homework");
    bot.click(By.id("addbutton"));


    Assert.assertTrue((4 == driver.findElements(By.tagName("li")).size()));

    }
}
