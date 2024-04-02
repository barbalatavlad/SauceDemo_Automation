package pages;

import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(css = "#first-name")
    WebElement firstName;
    @FindBy(css = "#last-name")
    WebElement lastName;
    @FindBy(css = "#postal-code")
    WebElement postalCode;
    @FindBy(css = "#continue")
    WebElement continueButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public void inputFirstName(){
        firstName.sendKeys(Constants.FIRST_NAME);
    }
    public void inputLastName(){
        lastName.sendKeys(Constants.LAST_NAME);
    }
    public void inputPostalCode(){
        postalCode.sendKeys(Constants.POSTAL_CODE);
    }
    public void pressContinueButton(){
        continueButton.click();
    }
}
