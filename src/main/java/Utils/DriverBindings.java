package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by User on 30.03.2017.
 */
public class DriverBindings
{
    WebDriver dr;
    public DriverBindings(WebDriver dr) {
        this.dr=dr;
    }
    public void Clickon(String elementId) {
        dr.findElement().click();
    }

    public void typeText(String elementId, String elementText)
    {

    }

    public WebElement getElement(By locator) {
        return dr.findElement(locator);
    }
}
