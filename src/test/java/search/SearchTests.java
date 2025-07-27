package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTests extends BaseTests {
    @Test
    public void search(){
        var searchPage=homePage.clickOnSearch();
        searchPage.setsearch("laptop");
        var searchPage1=searchPage.ClickOnSearchButton();


    }

}
