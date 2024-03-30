package week7.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class regester {
    public By firstName = By.id("input-firstname") ;
    public By lastName = By.id("input-lastname");
    public By Email = By.id("input-email");
    public By Tell = By.id("input-telephone");
    public By Pass1 = By.id("input-password");
    public By Pass2 = By.id("input-confirm");
    public By Subscribe= By.cssSelector("label[for='input-newsletter-no']");
    public By agree= By.cssSelector("label[for='input-agree']");
    public By submit= By.xpath("//input[@type='submit']");
    By congratulation = By.xpath("//h1");
    public void enterfirstname(String firstName,WebDriver driver){
      WebDriver Driver = driver ;
        Driver.findElement(this.firstName).sendKeys(firstName);

    }
    public void enterlastname(String lastName,WebDriver driver){
        WebDriver Driver = driver ;
        Driver.findElement(this.lastName).sendKeys(lastName);

    }
    public void enterEmail(String email, WebDriver driver) {
        driver.findElement(this.Email).sendKeys(email);
    }

    public void enterTelephone(String telephone, WebDriver driver) {
        driver.findElement(this.Tell).sendKeys(telephone);
    }

    public void enterPassword(String password, WebDriver driver) {
        driver.findElement(this.Pass1).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword, WebDriver driver) {
        driver.findElement(this.Pass2).sendKeys(confirmPassword);
    }

    public void selectSubscribe(WebDriver driver) {
        driver.findElement(this.Subscribe).click();
    }

    public void selectAgree(WebDriver driver) {
        driver.findElement(this.agree).click();
    }

    public void submitForm(WebDriver driver) {
        driver.findElement(this.submit).click();
    }
    public String  checkAccountCreated(WebDriver driver){
       String conferm ="";

        conferm = driver.findElement(congratulation).getText();
        return conferm;
    }
}
