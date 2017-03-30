package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 30.03.2017.
 */
public class SearchPage {
    WebDriver webDriver;
    LoginPage logP;
    String searchBtnMain="//*[id='xxxx']";
    By searchSecond=By.xpath("//");
    @FindBy(xpath="//")
    WebElement el;
    public void clickOnSearch() {
        webDriver.findElement(By.xpath("")).click();

    }
    public void differentClick() {
        webDriver.findElement(By.xpath(searchBtnMain)).click();
        webDriver.findElement(By.xpath(logP.loc)).click();
        webDriver.findElement(By.xpath(logP.getLoc())).click();
        el.click();
    }

}
