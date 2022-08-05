package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver){
        super(driver);
    }

    By pageTitleBy = By.xpath("//*[@id='center_column']/h1");
    By tShirtsButtonBy = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    String email = "aleksandar@code.rs";
    String password = "codeacademy";
    By tShirtsTitleBy = By.xpath("//*[@id='center_column']/h1/span[1]");
    By signOutButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
    By authenticationPageTitleBy = By.xpath("//*[@id='center_column']/h1");
    

    public MyAccountPage verifySuccesfulLogin(String expectedText){
        String actualText = readText(pageTitleBy);
        assertStringEquals(expectedText, actualText);
        return this;
    }

    public MyAccountPage verifyTShirtsPage(){
        click(tShirtsButtonBy);
        return this;
    }

    public MyAccountPage verifyLogout(){
        click(signOutButtonBy);
        waitVisibility(authenticationPageTitleBy);
        return this;
    }

   

    
}
