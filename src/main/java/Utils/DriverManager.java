package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 06.04.2017.
 */
public class DriverManager {

    public WebDriver driver;
    public WebDriverWait wait;
    String url;

    public void setUpDriver () {
        if (firefox) {

        }
        PropertiesReader pr=new PropertiesReader();
        if (System.getProperty("browser")!=null) {
            url =System.getProperty("browser");
        } else {
            url=pr.getProperty("src/main/resources/mainProp.properties","browser");
        }
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        // wait for element timeout
        wait=new WebDriverWait(driver,10)
        //  driver.manage().timeouts().implicitlyWait(60);
        driver.manage().window().maximize(); // раскрыть на весь экран
        driver.get("http://www.olx.ua");
    }
}
