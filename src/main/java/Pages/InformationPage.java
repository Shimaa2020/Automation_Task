package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage {
    private WebDriver driver;
    By username=By.id("first-name");
    By lastname=By.id("last-name");
    By zipcode=By.id("postal-code");
    By continue_button=By.id("continue");

    public InformationPage (WebDriver driver){
        this.driver = driver;
    }
    public CheckoutOverviewPage AddInfoForCheckout()
     {
driver.findElement(username).sendKeys("shaimaaTest");
driver.findElement(lastname).sendKeys("MahmoudTest");
driver.findElement(zipcode).sendKeys("246810");
driver.findElement(continue_button).click();
 return new CheckoutOverviewPage(driver);
    }
}
