package SmokeTestScope;

import Utils.SetupTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.security.Key;

import static java.awt.SystemColor.text;

/**
 * Created by User on 16.03.2017.
 */
public class FirstWebDriverTest extends SetupTest {





    @Test
    public void startFirstWebDriverTest() throws InterruptedException{
        WebDriverWait wait=new WebDriverWait(driver,10);


        driver.findElement(By.xpath("//*[@id=\"headerSearch\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"headerSearch\"]")).sendKeys("car");
        wait.wait (200);
     //   assertThat(0);

      // wait.until(ExpectedConditions.elementToBeSelected())

        driver.findElement(By.xpath("//*[@id=\"submit-searchmain\"]")).click();
        String txt=driver.findElement(By.xpath("//strong[contains(text(),'car')]")).getText();
        System.out.println(txt);
        Assert.assertTrue(txt.contains("car"));
        Assert.assertEquals(1,1);
        Assert.assertNotEquals(1,5);
     //   Assert.assertFalse(1==1);
      //  typeText("search-text","шапка");



    }
    public void ClickOn (String elementId) {}

    public  wait (String loc) {
        WebElement el;
        int time=0;
        do {
             el=driver.findElement(By.xpath(loc));
            time+=5;
            if (time==60) {
                throw new NoSuchElementException("");
            }
        } while (el!=null);


    }

    @Test(dependsOnMethods = "startFirstWebDriverTest")
    public void test2() throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        Thread.sleep(1400);
       // driver.findElement(By.id("search-text")).clear();
      //  driver.findElement(By.xpath("//*[contains(text(),'зарядка ip')]")).sendKeys("гусь");
        //driver.findElement(By.id("search-text")).sendKeys(Keys.RETURN);
        driver.findElement(By.id("search-submit")).click();

    }

}
