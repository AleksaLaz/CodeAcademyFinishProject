package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    By loginPageTitleBy = By.xpath("//*[@id='center_column']/h1");
    By emailFieldBy = By.id("email");
    By passwordFieldBy = By.id("passwd");
    By signInButtonBy = By.xpath("//*[@id='SubmitLogin']/span");
    By errorContainer = By.xpath("//*[@id='center_column']/div[1]/ol/li");
    By emailBy = By.id("email_create");

    public LoginPage login (String email, String password){
        writeText(emailFieldBy, email);
        writeText(passwordFieldBy, password);
        click(signInButtonBy);
        return this;
    }

    public LoginPage verifyUnSuccesfulLogin(String expectedText){
        String actualText = readText(errorContainer);
        assertStringEquals(expectedText, actualText);
        return this;
    }


 
}


