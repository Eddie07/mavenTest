package SmokeTestScope;

import Utils.DriverBindings;
import Utils.SetupTest;
import org.openqa.selenium.By;
import pages.MainSearchPage;

/**
 * Created by User on 06.04.2017.
 */
public class SecondClass extends SetupTest{
    DriverBindings dRb;
    public static final By submiSearch =By.xpath("submit-searchmain");
    public static final By searchText =By.xpath("submit-text");
    public MainSearchPage assertThatSearchMainCar() {

    }
    public DriverBindings getdRb () {
        return getdRb();
    }

}
