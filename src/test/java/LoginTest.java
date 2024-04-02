import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        loginPage.clickHamburgerMenu();
        loginPage.getLogoutText();
        String expectedText = "Logout";
        String actualText = loginPage.getLogoutText();
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void checkPageTitleTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getLoginLogo();
        String actualText = loginPage.getLoginLogo();
        String expectedText = "Swag Labs";
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void checkLoginButtonTest(){
        LoginPage loginPage = new LoginPage(driver);
      String actualColour =  loginPage.getLoginButtonColour();
      String expectedColour = "rgb(61, 220, 145)";
      Assert.assertEquals(actualColour,expectedColour);
    }


}
