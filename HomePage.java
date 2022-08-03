package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
    super(driver);
    }

    By popularButtonBy = By.xpath("//*[@id='home-page-tabs']/li[1]/a");
    By bestSellersButtonBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    By popularProductOneBy = By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img");
    By signInButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By numberOfpopularItems = By.xpath("//*[@id='homefeatured']/li");
    By numberOfBestSellersItems = By.xpath("//*[@id='blockbestsellers']/li");

    String baseUrl = "http://automationpractice.com/index.php";

    public HomePage basePage(){
        driver.get(baseUrl);
        return this;
    }

    public HomePage verifySignInButton(){
        click(signInButtonBy);
        return this;

    }
    
    public HomePage verifyPopularProductsButton(){
        click(popularButtonBy);
        waitVisibility(popularProductOneBy);
        return this;
    }

    public HomePage verifyBestSellersButton(){
        click(bestSellersButtonBy);
        return this;
    }

    public HomePage verifyNumberOfPopularProducts(int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(numberOfpopularItems);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }

    public HomePage verifyNumberOfBestSellersProducts(int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(numberOfBestSellersItems);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }
   
}
