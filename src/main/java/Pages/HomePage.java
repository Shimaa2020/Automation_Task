package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private WebDriver driver;
    By ProductsList = By.className("inventory_item_price");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage lowestprice() {
        List<WebElement> list = driver.findElements(ProductsList);
        float lowest = Float.parseFloat(list.get(0).getText().substring(1));
        int indexoflowestprice = 0;
        for (int i = 0; i < list.size(); i++) {
            float price = Float.parseFloat(list.get(i).getText().substring(1));
            if (price < lowest) {
                lowest = price;
                indexoflowestprice = i;
            }
        }
        List<WebElement> AddToCart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
        AddToCart.get(indexoflowestprice).click();
        driver.findElement(By.className("shopping_cart_link")).click();

        return new CartPage(driver);

    }

}
