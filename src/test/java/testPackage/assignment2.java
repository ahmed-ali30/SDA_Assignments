package testPackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

/*
   Go to URL: https://the-internet.herokuapp.com/dropdown
   Create method selectByIndexTest and Select Option 1 using index .@
   Create method selectByValueTest Select Option 2 by value.@
   Create method selectByVisibleTextTest Select Option 1 value by visible text.@
   Create method printAllTest Print all dropdown value.@
   Verify the dropdown has Option 2 text.@
   Create method printFirstSelectedOptionTest Print first selected option.@
   Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.@
    */
public class assignment2 extends Tests{
    @Test
    public void test(){
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        Select menu = new Select(driver.findElement(By.id("dropdown")));
        selectByIndexTest(1,menu);
        selectByValueTest("2",menu);
        selectByVisibleTextTest("Option 2",menu);
        printAllTest(menu);
        verfy(menu,"Option 2");
        printFirstSelectedOptionTest(menu);

                if(menu.getOptions().size()==3){
            System.out.println("Expected Is Not Equal Actual");
        }
        }



    //Assertions.assertEquals(menu.selectByValue("Option 2"));
    public void selectByIndexTest(int s,Select menu){menu.selectByIndex(s);
    }
    private void selectByValueTest(String s,Select menu) {
        menu.selectByValue(s);
    }
    private void selectByVisibleTextTest(String s, Select menu) {
        menu.selectByVisibleText(s);
    }

    private void printAllTest(Select menu) {
        List<WebElement> selectedOptionList = menu.getOptions();
        for(WebElement a:selectedOptionList){
            System.out.println(a.getText());
        }

    }
    public void verfy(Select menu, String s){
        boolean optionExists= false;
        for (WebElement option : menu.getOptions()) {
            if (option.getText().equals(s)) {
                 optionExists = true;
                break;
            }
        }
        // Check if the option exists and print the result
        if (optionExists) {
            System.out.println("The option '" + s + "' exists in the dropdown.");
        } else {
            System.out.println("The option '" + s + "' does not exist in the dropdown.");
        }
    }
    private void printFirstSelectedOptionTest(Select menu) {
        System.out.println(menu.getFirstSelectedOption().getText());
    }


}
