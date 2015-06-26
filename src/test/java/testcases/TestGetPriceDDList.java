package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchForm;
import pages.GetPriceDDList;
import support.SetupTest;

/**
 * Created by tieuthanh on 26/06/2015.
 */
public class TestGetPriceDDList extends SetupTest{
    @Test
    public void test_PriceDDList() throws InterruptedException{
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotosearchTextBox();


        SearchForm searchform = new SearchForm();
        Assert.assertEquals(searchform.getValue(), Boolean.TRUE);
        searchform.gotoPriceDDList();

        GetPriceDDList getPriceDDList = new GetPriceDDList();
        Assert.assertEquals(getPriceDDList.getPrDDList(), Boolean.TRUE);
        getPriceDDList.get_defautItem();
        getPriceDDList.select_dropdownItem();

    }
}
