package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.DetailsProduct;
import support.SetupTest;


/**
 * Created by tieuthanh on 26/06/2015.
 */
public class TestDetailsProduct extends SetupTest{
    @Test
    public void test_DetailProPage() {
        HomePage homepage = new HomePage();
    //    Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotodetailproPage();

        DetailsProduct product = new DetailsProduct();
        Assert.assertEquals(product.getDetailProPage(), Boolean.TRUE);
        product.BuyNow();
    }

}
