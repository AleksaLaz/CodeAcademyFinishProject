package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginTests extends BaseTest {
    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;

    String email = "aleksandar@code.rs";
    String password = "codeacademy";
    String expectedText = "MY ACCOUNT";
    String invalidEmail = "aleksa@mts.rs";
    String invalidEmailError = "Authentication failed.";
    String invalidPassword = "code";
    String invalidPasswordError = "Invalid password.";
    String emptyEmail = "";
    String emptyEmailError = "An email address required.";
    String emptyPassword = "";
    String emptyPasswordError = "Password is required.";

    @Test
    public void verifySuccesfulLogin(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        homePage.basePage();
        homePage.verifySignInButton();
        loginPage.login(email, password);
        myAccountPage.verifySuccesfulLogin(expectedText);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }


    }

    @Test
    public void verifyInvalidEmailError(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage= new LoginPage(driver);
        homePage.basePage();
        homePage.verifySignInButton();
        loginPage.login(invalidEmail, password);
        loginPage.verifyUnSuccesfulLogin(invalidEmailError);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }
    
    @Test
    public void verifyInvalidPasswordError(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage= new LoginPage(driver);
        homePage.basePage();
        homePage.verifySignInButton();
        loginPage.login(email, invalidPassword);
        loginPage.verifyUnSuccesfulLogin(invalidPasswordError);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    @Test
    public void verifyEmptyEmailError(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage= new LoginPage(driver);
        homePage.basePage();
        homePage.verifySignInButton();
        loginPage.login(emptyEmail, password);
        loginPage.verifyUnSuccesfulLogin(emptyEmailError);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }
    
    @Test
    public void verifyEmptyPasswordError(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage= new LoginPage(driver);
        homePage.basePage();
        homePage.verifySignInButton();
        loginPage.login(email, emptyPassword);
        loginPage.verifyUnSuccesfulLogin(emptyPasswordError);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
