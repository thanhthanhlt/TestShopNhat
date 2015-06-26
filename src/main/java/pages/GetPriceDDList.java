package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static support.Helpers.driver;
import static support.Helpers.find_element;
/**
 * Created by tieuthanh on 25/06/2015.
 */
public class GetPriceDDList {
    By priceDDList = By.xpath("//*[@id='frmKeywordSearch']/div/div[1]/select");
    By price = By.xpath("//*[@id='frmKeywordSearch']/div/div[1]/select/option[1]");
    String priceTxt = "Giá bán";

    public Boolean getPrDDList(){
        if (check_default()==true)
            return true;
        else
            return false;
    }

    public List<WebElement> get_defautItem(){
        Select select = new Select(find_element(priceDDList));
        List<WebElement> listItem = select.getOptions();
        return listItem;
    }
    public void select_dropdownItem() throws InterruptedException{
        Select select = new Select(find_element(priceDDList));
        List<WebElement> listItem = select.getOptions();
        for (int i=0; i<listItem.size();i++){
            select.selectByIndex(i);
            Thread.sleep(2000);
        }
    }
    public boolean check_default() {
        boolean result = false;
        WebElement select_price = driver.findElement(priceDDList);
        List<WebElement> options = select_price.findElements(price);
        for (WebElement option : options)
        {
            if (option.getText().equals(priceTxt))
                result = true;
        }
        return result;
    }

}
