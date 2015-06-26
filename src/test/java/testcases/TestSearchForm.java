package testcases;

import org.testng.Assert;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchForm;
import support.SetupTest;

/**
 * Created by tieuthanh on 26/06/2015.
 */
public class TestSearchForm extends SetupTest {
    @Test
    public void test_SearchForm(String querry){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotosearchTextBox();


        SearchForm searchform = new SearchForm();
        Assert.assertEquals(searchform.getValue(), Boolean.TRUE);
        searchform.gotoPriceDDList();
        searchform.inputQuerry(querry);

    }
}
