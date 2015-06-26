package testcases;

import org.testng.Assert;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchForm;
import support.SetupTest;
import org.testng.annotations.DataProvider;


/**
 * Created by tieuthanh on 26/06/2015.
 */
public class TestSearchForm extends SetupTest {
    @DataProvider
    Object[][] getQuerry() {
        return new Object[][]{
                {"fghgfghgd"},

        };
    }
    @Test(dataProvider = "getQuerry")

    public void test_SearchForm(String querry){
        HomePage homepage = new HomePage();
        homepage.gotosearchTextBox();


        SearchForm searchform = new SearchForm();
//        Assert.assertEquals(searchform.getValue(), Boolean.TRUE);
        searchform.gotoPriceDDList();
        searchform.inputQuerry(querry);

    }
}
