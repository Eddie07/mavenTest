package pages;

import Utils.DriverBindings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 30.03.2017.
 */
public class MainSearchPage {
    DriverBindings drB;
    public MainSearchPage(WebDriver dr) {
        drB=new DriverBindings(dr);
    }

    WebDriver dr;
    public void searchCar() {

        drB.typeText("headerSearch","car");
        drB.clickOn ("submit-searchmain");
        drB.click();
    }
}
