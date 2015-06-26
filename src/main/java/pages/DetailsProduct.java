package pages;
import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;
/**
 * Created by tieuthanh on 25/06/2015.
 */
public class DetailsProduct {
    By buyBtn = By.xpath("//*[@id=\"frmProduct_\"]/div/div[2]/div[7]/button[1]");
    String buyBtnTxt = "CHỌN MUA";

    By proPageTit = By.xpath("//div[5]/div[2]/div[5]/div[1]/h1");
    By imgBox = By.xpath("//*[@id=['frmProduct_']/div/div[1]/div[1]/a/div/div[2]/div/div[2]");


    public Boolean getDetailProPage(){
        return find_element(buyBtn).getText().equals(buyBtnTxt);
    }
    public void BuyNow(){
        find_element(buyBtn).click();
    }

}
