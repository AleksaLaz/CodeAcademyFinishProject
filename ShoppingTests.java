package tests;

import org.junit.Test;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.TShirtsPage;
import pages.TShirtsProductPage;



public class ShoppingTests extends BaseTest {
    public HomePage homePage;

    int numberOfAllItems = 7;
    String email = "aleksandar@code.rs";
    String password = "codeacademy";
    String expectedText = "T-SHIRTS ";

    @Test
    public void numberOfPopularProducts(){
        HomePage homePage = new HomePage(driver);
        homePage.basePage();
        homePage.verifyPopularProductsButton();
        homePage.verifyNumberOfPopularProducts(numberOfAllItems);
        
    

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void numberOfBestSelersProducts(){
        HomePage homePage = new HomePage(driver);
        homePage.basePage();
        homePage.verifyBestSellersButton();
        homePage.verifyNumberOfBestSellersProducts(numberOfAllItems);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }    
    }

    @Test
    public void tShirtAdToCart(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        TShirtsPage tShirtsPage = new TShirtsPage(driver);
        TShirtsProductPage tShirtsProductPage = new TShirtsProductPage(driver);
        homePage.basePage();
        homePage.verifySignInButton();
        loginPage.login(email, password);
        myAccountPage.verifyTShirtsPage();
        tShirtsPage.verifyTShirtsPageOpened(expectedText);
        tShirtsPage.verifyTShirtsProduct();
        tShirtsProductPage.verifyAdToCart();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }    
    }

    @Test
    public void verifyTotalPrice(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        TShirtsPage tShirtsPage = new TShirtsPage(driver);
        TShirtsProductPage tShirtsProductPage = new TShirtsProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.basePage();
        homePage.verifySignInButton();
        loginPage.login(email, password);
        myAccountPage.verifyTShirtsPage();
        tShirtsPage.verifyTShirtsPageOpened(expectedText);
        tShirtsPage.verifyTShirtsProduct();
        tShirtsProductPage.verifyAdToCart();
        tShirtsProductPage.verifyCartPageOpened();
        cartPage.verifyTotalPrice();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }    
    }
    
}
