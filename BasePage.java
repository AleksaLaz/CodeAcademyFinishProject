package pages;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;


    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public void waitVisibility (By elementBy){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }
    public void click (By elementBy){
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        driver.findElement(elementBy).click();
    }
    public void writeText (By elementBy, String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);;
    }
    public String readText (By totalProductsPriceBy){
        waitVisibility(totalProductsPriceBy);
        return driver.findElement(totalProductsPriceBy).getText();
    }
    public void assertStringEquals (String string, String expectedText){
        Assert.assertEquals(string, expectedText);
    }
    public int countItems(By elementBy){
        waitVisibility(elementBy);
        return driver.findElements(elementBy).size();
    }
    public void assertIntegerEquals(int expectedNumberOfItems, int actualNumberOfItems){
        assertEquals(expectedNumberOfItems, actualNumberOfItems);
    }
    public String readHref(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getAttribute("href");
    }

    
}
