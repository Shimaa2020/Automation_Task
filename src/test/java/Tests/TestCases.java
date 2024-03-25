package Tests;

import Pages.*;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseTest {

@Test
public void FullCycleTest(){
    HomePage homePage= loginPage.login();
    CartPage cartPage=homePage.lowestprice();
    InformationPage informationPage=cartPage.checkout();
    CheckoutOverviewPage checkoutOverview= informationPage.AddInfoForCheckout();
    CheckoutCompletePage checkoutCompletePage=checkoutOverview.FinishCheckout();
    String txt= checkoutCompletePage.GetOrderCompleteMessage();
    Assert.assertTrue(txt.contains("Thank you for your order!"));
}



}
