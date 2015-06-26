package pages;


import org.openqa.selenium.By;
import static support.Helpers.find_element;

/**
 * Created by tieuthanh on 25/06/2015.
 */
public class HomePage {
    By homePageTitle = By.xpath("//head/title");
    String homePageTxt = "Shop Nhất - Hàng xách tay Nhật, Mỹ phẩm, Thực phẩm chức năng, Tất, Quần áo, Rượu, Sữa, Gia dụng";

    By homePageBtn = By.xpath("//div[3]/div/ul/li[4]/a");
    By newsPageBtn = By.xpath("//div[3]/div/ul/li[3]/a");
    By salePageBtn = By.xpath("//div[3]/div/ul/li[2]/a");
    By contactPageBtn = By.xpath("//div[3]/div/ul/li[1]/a");
    By getInfoForm = By.xpath("//div[5]/div[1]/div[6]");
    By product = By.id("ProductImages");
    By searchTxtBox= By.xpath("//*[@id=['frmKeywordSearch']/div/div[1]");

    public Boolean homePageLoaded() {
        return find_element(homePageTitle).getText().equals(homePageTxt);

    }

    public void gotohomePage() {
        find_element(homePageBtn).click();
    }

    public void gotonewsPage() {
        find_element(newsPageBtn).click();
    }

    public void gotosalePage() { find_element(salePageBtn).click(); }

    public void gotocontactPage() { find_element(contactPageBtn).click(); }

    public void gotodetailproPage(){ find_element(product).click(); }

    public void gotosearchTextBox(){ find_element(searchTxtBox).click(); }

    public void gotogetInfoForm(){ find_element(getInfoForm).click();}
}
