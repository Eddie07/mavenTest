package SmokeTestScope;

/**
 * Created by User on 23.03.2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.Key;

/**
 * Created by User on 16.03.2017.
 */
public class Second {

    WebDriver driver;

    @BeforeClass
    public  void setUp(){

        // System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // раскрыть на весь экран
        driver.get("http://www.google.com.ua");

    }

    @Test
    public void startFirstWebDriverTest() {

        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("car");
        driver.findElement(By.xpath("//*[@id=\"_fZl\"]")).click();

    }

    @Test(dependsOnMethods = "startFirstWebDriverTest")
    public void test2() throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        Thread.sleep(1400);
        // driver.findElement(By.id("search-text")).clear();
        driver.findElement(By.xpath("//*[contains(text(),'зарядка ip')]")).sendKeys("гусь");
        //driver.findElement(By.id("search-text")).sendKeys(Keys.RETURN);
        driver.findElement(By.id("search-submit")).click();

    }

}
