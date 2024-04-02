package pages;

import data.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "#user-name")
    WebElement username;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#login-button")
    WebElement loginButton;

    @FindBy(css = "#react-burger-menu-btn")
    WebElement hamburgerMenu;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername() {
        username.sendKeys(Constants.USERNAME);
    }

    public void inputPassword() {
        password.sendKeys(Constants.PASSWORD);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickHamburgerMenu() {
        hamburgerMenu.click();
    }

    public String getLogoutText() {
        return driver.findElement(By.cssSelector("#logout_sidebar_link")).getText();
    }

    public String getLoginLogo() {
        return driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
    }

    public String getLoginButtonColour() {
        return driver.findElement(By.cssSelector("#login-button")).getCssValue("background-color");
    }
}
