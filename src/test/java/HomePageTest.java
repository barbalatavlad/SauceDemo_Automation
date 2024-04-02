import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseTest{
    @Test
    public void getProductImagesNumberTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        HomePage homePage = new HomePage(driver);
        int expectedNumber = 6;
        int actualNumber = homePage.getProductImagesNumber();
        Assert.assertEquals(actualNumber,expectedNumber);
    }
}
