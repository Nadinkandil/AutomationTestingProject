package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    private By selectFemale=By.id("gender-female");
    private By firstnameField=By.id("FirstName");
    private By lasrtnameField= By.id("LastName");
    private By emailField=By.id("Email");
    private By passwordField=By.id("Password");
    private By confirmPasswordField=By.id("ConfirmPassword");
    private By registerButton=By.id("register-button");
    public RegisterPage (WebDriver driver){
        this.driver=driver;
    }

    public void selectFemale(){
        driver.findElement(selectFemale).click();
    }
     public void setFirstName(String firstname){
        driver.findElement(firstnameField).sendKeys(firstname);
     }
    public void setLastName(String lastname){
        driver.findElement(lasrtnameField).sendKeys(lastname);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPaswword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setConfirmPassword(String confirmPassword){
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }
    public ContinuePage ClickOnRegisterButton(){
        driver.findElement(registerButton).click();
        return new ContinuePage(driver);
    }






}
