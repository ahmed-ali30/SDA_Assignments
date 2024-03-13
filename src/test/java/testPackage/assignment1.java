package testPackage;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.List;

public class assignment1 extends Tests {
  //  Task 1 - Old Style Select Menu
  //https://demoqa.com/select-menu
  //Get all the options of the dropdown
  //print the Options size
  //Print all options
  //Verify the dropdown has option "Black"
  //Print FirstSelectedOptionTest
  //Select option "Yellow"
  @Test
  public void mainmethod() {
    driver.navigate().to("https://demoqa.com/select-menu");
    By menu = By.id("oldSelectMenu");
    Select drobmenu = new Select(driver.findElement(menu));

    task1(drobmenu);
    task2(drobmenu);
    task3(drobmenu);
    Assertions.assertTrue(task4(drobmenu));;
    task5(drobmenu);
    task6(drobmenu);
  }


  public void task1(Select drobmenu) {

    List<WebElement> options = drobmenu.getOptions();
  }

  public void task2(Select drobmenu) {
    List<WebElement> options = drobmenu.getOptions();
    System.out.println(options.size());
  }

  public void task3(Select drobmenu) {
    List<WebElement> options = drobmenu.getOptions();
    for (WebElement option : options) {
      System.out.println(option.getText());
    }

  }

  public boolean task4(Select drobmenu) {
    boolean has = false;
    List<WebElement> options = drobmenu.getOptions();
    for (WebElement option : options) {
      if(option.getText().equals("Black")) {
        has=true;
        break;
      }
    }
    return has;
  }

  public void task5(Select drobmenu) {
    System.out.println(drobmenu.getFirstSelectedOption());
  }

  public void task6(Select drobmenu) {
    drobmenu.selectByVisibleText("Yellow");

  }
}
