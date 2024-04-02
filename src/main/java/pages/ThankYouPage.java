package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThankYouPage extends BasePage {
    @FindBy(css = "#back-to-products")
    WebElement backToHomePage;
    public ThankYouPage(WebDriver driver) {
        super(driver);
    }

    public void clickBackToHomepage(){
        backToHomePage.click();
    }
    public String getThankYouMessage(){
        return driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
    }
}
