package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage (WebDriver driver){
        this.driver = driver;
    }

    public InformationPage checkout()
    {
        driver.findElement(By.id("checkout")).click();
        return new InformationPage(driver);
    }


}
