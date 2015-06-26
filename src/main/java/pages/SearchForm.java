package pages;
import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by tieuthanh on 25/06/2015.
 */
public class SearchForm {
    By value = By.xpath("//*[@id='value']");
    String valueTxt = "Gõ từ khoá";
    By priceDDList = By.xpath("//*[@id='frmKeywordSearch']/div/div[1]/select");
    By searchImg = By.xpath("//*[@id='frmKeywordSearch']/div/div[1]/input[1]");

    //public Boolean getValue(){
       // return find_element(value).getText().equals(valueTxt);
   // }
    public void gotoPriceDDList() {
        find_element(priceDDList).click();
    }
    public void inputQuerry(String query){
        find_element(value).sendKeys(query);
        find_element(searchImg).click();
        driver.navigate().back();
    }




}
