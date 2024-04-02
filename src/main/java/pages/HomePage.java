package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    WebElement backpackToCart;

    @FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement shirtToCart;

    @FindBy(css = "//a[@class='shopping_cart_link']")
    WebElement toCart;

    @FindBy(xpath = "//img[@class='inventory_item_img']")
    List<WebElement> productImagesList;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addBackpackToCart() {
        backpackToCart.click();
    }

    public void addShirtToCart() {
        shirtToCart.click();
    }

    public void goToCart() {
        toCart.click();
    }

    public int getProductImagesNumber() {
        return productImagesList.size();
    }
}
