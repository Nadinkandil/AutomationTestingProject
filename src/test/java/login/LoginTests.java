package login;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import org.openqa.selenium.support.Color;

public class LoginTests extends BaseTests {
    @Test
    public void testLogin() {
        var loginPage=homePage.clickLogin();
        loginPage.setEmailField("test55@example.com");
        loginPage.setPasswordField("P@ssw0rd");
        var homepage=loginPage.clickOnLoginButton();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(loginPage.getCurrentUrl() ,"https://demo.nopcommerce.com/","the url is incorrect");
        softAssert.assertTrue(loginPage.myAccountTabIsDisplayed(),"my account tab is not displayed");
        softAssert.assertAll();

    }
    @Test
    public void testInvalidLogin(){
        var loginpage=homePage.clickLogin();
        SoftAssert softAssert=new SoftAssert();
        loginpage.setEmailField("wrong@example.com");
        loginpage.setPasswordField("P@ssw0rd");
        var homepage=loginpage.clickOnLoginButton();
        softAssert.assertEquals(loginpage.unsucessfullMsg(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","unsuccessful msg");
        softAssert.assertEquals(loginpage.getMsgColor(),Color.fromString("rgba(228, 67, 75, 1)").asHex(),"wrong color");

    }

}
