package login;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests extends BaseTests {
    @Test
    public void testLogin() {
        var loginPage=homePage.clickLogin();
        loginPage.setEmailField("test55@example.com");
        loginPage.setPasswordField("P@ssw0rd");

        var homepage=loginPage.clickOnLoginButton();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(homepage.);



    }

}
