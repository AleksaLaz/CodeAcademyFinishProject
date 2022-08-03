package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TShirtsProductPage extends BasePage{

    public TShirtsProductPage(WebDriver driver){
        super(driver);
    }

    By adTocartButtonBy = By.xpath("//*[@id='add_to_cart']/button/span");
    By proceedToCheckoutButtonBy = By.xpath("//*[@id=,layer_cart']/div[1]/div[2]/div[4]/a/span");
    By closeWindowButtonBy = By.xpath("//*[@id='layer_cart']/div[1]/div[1]/span");
    By cartButtonBy = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/b");
    By shoppingCartBadgeBy = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]");
    By cartPageTitleBy = By.id("cart_title"); 

    public TShirtsProductPage verifyAdToCart(){
        click(adTocartButtonBy);
        click(closeWindowButtonBy);
        waitVisibility(shoppingCartBadgeBy);
        return this;
    }
    
    public TShirtsProductPage verifyCartPageOpened(){
        click(cartButtonBy);
        waitVisibility(cartPageTitleBy);
        return this;
    }
    
}
