package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    private WebDriver driver;
    By finishButton= By.id("finish");
    public CheckoutOverviewPage(WebDriver driver){
        this.driver = driver;
    }

public CheckoutCompletePage FinishCheckout()
{
    driver.findElement(finishButton).click();
   return new CheckoutCompletePage(driver);
}

}
