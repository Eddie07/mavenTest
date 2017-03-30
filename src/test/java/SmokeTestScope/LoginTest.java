package SmokeTestScope;

import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * Created by User on 30.03.2017.
 */
public class LoginTest {
    LoginPage logP;
    @Test
    public void loginTest(){
        logP=new LoginPage();
        logP.login();


    }
}
