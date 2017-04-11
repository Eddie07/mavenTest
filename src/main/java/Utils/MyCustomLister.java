package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.reporters.Files;

/**
 * Created by User on 06.04.2017.
 */
public class MyCustomLister extends TestListenerAdapter {
    public void onTestFailure(ITestResult var1) {
        System.out.println("**************************");
        System.out.println("Test Failure");
        System.out.println("**************************");

    }
    public void onTestSuccess(ITestResult var1) {
        System.out.println("**************************");
        System.out.println("Test Success");
        System.out.println("**************************");
        Files scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    }
    public void onTestStart(ITestResult var1) {
        System.out.println("**************************");
        System.out.println("Test Start"+var1.getName());
        System.out.println("**************************");

    }
}
