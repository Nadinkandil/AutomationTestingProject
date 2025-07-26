package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContinuePage {
    private WebDriver driver;
    private By sucessMsg= By.className("result");
    public ContinuePage(WebDriver driver){
        this.driver=driver;
    }
    public boolean isMsgDisplayed(){
        return driver.findElement(sucessMsg).isDisplayed();
    }
    public String getText(){
        return driver.findElement(sucessMsg).getText();
    }
    public String getMsgColor(){
        return driver.findElement(sucessMsg).getCssValue("color");
    }

}
