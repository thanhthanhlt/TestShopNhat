package testcases;


import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import pages.HomePage;
import pages.GetInfoForm;
import support.SetupTest;


/**
 * Created by tieuthanh on 26/06/2015.
 */
public class TestGetInfo extends SetupTest{
    @DataProvider
    Object[][] getemail() {
        return new Object[][]{
                {"thanh@gmail.com"}
        };
    }

    @Test(dataProvider = "getemail")

    public void test_GetInfoForm(String email){
        HomePage homepage = new HomePage();
      //  Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotogetInfoForm();

        GetInfoForm get_infoform = new GetInfoForm();
     //   Assert.assertEquals(get_infoform.getInfoFormLoaded(), Boolean.TRUE);
        Assert.assertEquals(get_infoform.emailRequestDisplay(), Boolean.TRUE);
        get_infoform.inputEmailAdd(email);


    }
}
