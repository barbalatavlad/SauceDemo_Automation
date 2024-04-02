package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath ="#checkout" )
    WebElement checkout;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void goToCheckout() {
        checkout.click();
    }
}
