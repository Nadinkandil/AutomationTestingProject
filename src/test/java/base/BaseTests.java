package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import org.openqa.selenium.WebDriver;
public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        homePage=new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
         driver.quit();
     }
}
