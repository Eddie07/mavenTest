package Utils;

import org.testng.IAlterSuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

/**
 * Created by User on 11.04.2017.
 */
public class MyCustomListener2 implements ITestListener {
    public void onTestStart(ITestResult ITestResult ) {
        System.out.println("Test start");
        Logger log=Logger.getLogger(MyCustomListener2.class);
        log.info("This is info");
        log.debug("this is debug");
        log.error("this sis error");
        log.trace("Trace");
        log.info("********************");


    }

    void onTestSuccess(ITestResult var1);

    void onTestFailure(ITestResult var1);

    void onTestSkipped(ITestResult var1);

    void onTestFailedButWithinSuccessPercentage(ITestResult var1);

    void onStart(ITestContext var1);

    void onFinish(ITestContext var1);
}
