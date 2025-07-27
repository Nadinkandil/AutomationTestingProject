package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import java.awt.*;

public class LoginPage {
    private WebDriver driver;
    private By emailField= By.id("Email");
    private By passwordField=By.id("Password");
    private By loginButton=By.xpath("//button[@class='button-1 login-button']");
    private By myAccount=By.className("ico-account");
    private By unsuccessfullMsg=By.xpath("//div[@class='message-error validation-summary-errors']");
    public LoginPage (WebDriver driver){

        this.driver=driver;
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPasswordField(String password){

        driver.findElement(passwordField).sendKeys(password);
    }
    public HomePage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
    public String getCurrentUrl(){

        return driver.getCurrentUrl();
    }
    public boolean myAccountTabIsDisplayed(){

        return driver.findElement(myAccount).isDisplayed();
    }
    public String unsucessfullMsg(){
        return driver.findElement(unsuccessfullMsg).getText();
    }
    public String getMsgColor(){
        WebElement msgElement = driver.findElement(unsuccessfullMsg);
        return Color.fromString(msgElement.getCssValue("color")).asHex();
    }



}
