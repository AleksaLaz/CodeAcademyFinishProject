package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver){
        super(driver);
    }

    By totalProductsPriceBy = By.id("total_product");
    By totalShippingPriceBy = By.id("total_shipping");
    By totalPriceBy = By.id("total_price");

    public CartPage verifyTotalPrice(){
        String totalProductsPrice = readText(totalProductsPriceBy);
        totalProductsPrice = totalProductsPrice.replace("$", "");
        String totalShippingPrice = readText(totalShippingPriceBy);
        totalShippingPrice = totalShippingPrice.replace("$", "");
        String totalPrice = readText(totalPriceBy);
        totalPrice = totalPrice.replace("$", ""); 
        double x = Double.parseDouble(totalProductsPrice);
        double y = Double.parseDouble(totalShippingPrice);
        double d = Double.parseDouble(totalPrice);
        double z = x + y;
        assertEquals(d, z , 0.0);
        return this;
        }

    
    
}
