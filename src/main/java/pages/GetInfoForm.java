package pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;


/**
 * Created by tieuthanh on 25/06/2015.
 */
public class GetInfoForm {
    By getInfoFormTitle = By.xpath("//div[5]/div[1]/div[6]/div[1]/span");
    String getInfoFormTxt = "Đăng ký nhận tin";

    By emailRequestTxt = By.xpath("//*[@id=['frmNLetter14']/div[1]");
    String emaiTxt = "Nhập địa chỉ Email của bạn";

    By inputEmailTextBox = By.xpath("//*[@id=['Email']");
    By signUpBtn = By.xpath("//*[@id=['frmNLetter14']/div[2]/button");

    public Boolean emailRequestDisplay(){
        return find_element(emailRequestTxt).getText().equals(emaiTxt);
    }

    public Boolean getInfoFormLoaded(){

        return find_element(getInfoFormTitle).getText().equals(getInfoFormTxt);
    }
    public void inputEmailAdd(String email){
        find_element(inputEmailTextBox).sendKeys(email);
        find_element(signUpBtn).click();
        driver.navigate().back();
    }


}
