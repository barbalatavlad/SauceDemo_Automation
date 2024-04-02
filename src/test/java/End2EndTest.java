
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class End2EndTest extends BaseTest{
    @Test
    public void buyProductTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        HomePage homePage = new HomePage(driver);
        homePage.addBackpackToCart();
        homePage.addShirtToCart();
        homePage.goToCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.goToCheckout();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputFirstName();
        checkoutPage.inputLastName();
        checkoutPage.inputPostalCode();
        checkoutPage.pressContinueButton();
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.pressFinishButton();
        ThankYouPage thankYouPage = new ThankYouPage(driver);
        String actualMessage = thankYouPage.getThankYouMessage();
        String expectedMessage = "Thank you for your order!";
        Assert.assertEquals(actualMessage,expectedMessage);
        thankYouPage.clickBackToHomepage();
    }
}
