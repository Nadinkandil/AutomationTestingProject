package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By search=By.id("small-searchterms");
    private By searchButton=By.xpath("//button[@class='button-1 search-box-button']");
    public SearchPage (WebDriver driver){
        this.driver=driver;
    }
    public void setsearch(String text){
        driver.findElement(search).sendKeys(text);
    }
    public SearchPage ClickOnSearchButton(){
        driver.findElement(searchButton).click();
        return new SearchPage(driver);

    }
}
