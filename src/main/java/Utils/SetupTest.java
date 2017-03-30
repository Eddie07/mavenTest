package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 23.03.2017.
 */
public class SetupTest {
    public WebDriver driver;
  //  public LoginPage logP;
    @BeforeClass
    public  void setUp(){


        // System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        // wait for element timeout
      //  driver.manage().timeouts().implicitlyWait(60);
        driver.manage().window().maximize(); // раскрыть на весь экран
        driver.get("http://www.olx.ua");





    }
    @AfterClass
    public void tearDown() {
    }
}
