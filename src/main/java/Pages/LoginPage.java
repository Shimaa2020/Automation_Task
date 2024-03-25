package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    By UserName = By.id("user-name");
    By Password = By.id("password");
    By LoginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login() {
        driver.findElement(UserName).sendKeys("standard_user");
        driver.findElement(Password).sendKeys("secret_sauce");
        driver.findElement(LoginButton).click();
        return new HomePage(driver);
    }

}
