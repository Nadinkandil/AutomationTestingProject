package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
    private By search=By.id("small-searchterms");
    public HomePage (WebDriver driver){
        this.driver=driver;
    }

    public RegisterPage ClickRegister(){
        clickLink("Register");
        return new RegisterPage(driver);
    }
    public LoginPage clickLogin(){
        clickLink("Log in");
        return new LoginPage(driver);
    }
    public SearchPage clickOnSearch(){
        driver.findElement(search).click();
        return new SearchPage(driver);
    }

    private void clickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }


}
