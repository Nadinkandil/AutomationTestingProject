package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailField= By.id("Email");
    private By passwordField=By.id("Password");
    private By loginButton=By.className("button-1 login-button");
    private By myAccount=By.className("ico-account");
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



}
