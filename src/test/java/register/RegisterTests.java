package register;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegisterPage;
import static org.testng.Assert.*;
public class RegisterTests extends BaseTests {
        @Test
        public void testSuccessfulRegister(){
            var registerPage=homePage.ClickRegister();
            registerPage.selectFemale();
            registerPage.setFirstName("automation");
            registerPage.setLastName("tester");
            registerPage.setEmail("test55@example.com");
            registerPage.setPaswword("P@ssw0rd");
            registerPage.setConfirmPassword("P@ssw0rd");

            var continuePage=registerPage.ClickOnRegisterButton();
            assertTrue(continuePage.isMsgDisplayed(),"message is not displayed");
            assertEquals(continuePage.getText(),"Your registration completed","registeration not complete");
            assertEquals(continuePage.getMsgColor(),"rgba(76, 177, 124, 1)","the color is not the same color");
//
//        }
}}

