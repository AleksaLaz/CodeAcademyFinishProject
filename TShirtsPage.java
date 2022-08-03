package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TShirtsPage extends BasePage{

    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    By tShirtProductBy = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a");
    By tShirtsTitleBy = By.xpath("//*[@id='center_column']/h1/span[1]");

    
    
    public TShirtsPage verifyTShirtsPageOpened(String expectedText){
        String actualText = readText(tShirtsTitleBy);
        assertStringEquals(actualText, expectedText);
        return this;

    }
    
    
    public TShirtsPage verifyTShirtsProduct(){
        click(tShirtProductBy);
        return this;
 
    }
    

}
