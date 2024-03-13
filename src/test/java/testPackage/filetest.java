package testPackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.nio.file.Path;

public class filetest extends Tests{
    /**
     * Breakout Activity: 20 minute
     * navigate to <a href="https://the-internet.herokuapp.com/upload">Upload Test</a>
     * uploading any file from your machine (make it small please)
     * checking to see that the file was successfully uploaded
     */

    @Test
    public void uploadFile(){
        String  url = "https://the-internet.herokuapp.com/upload";
        driver.get(url);
        logger.info("entering the "+url);
        By fileUploadInput = By.xpath("(//input[@type='file'])[1]");
        driver.findElement(fileUploadInput).sendKeys("C:\\Users\\Ahmed\\Documents\\test file upload.txt");
        logger.info("finding the button ");
        driver.findElement(fileUploadInput).submit();
        logger.info("submit the file");
        By uploadSuccessfullyLabel = By.tagName("h3");
        logger.info("assert that file is uploading");
        Assertions.assertEquals("File Uploaded!", driver.findElement(uploadSuccessfullyLabel).getText());
        
    }
}
