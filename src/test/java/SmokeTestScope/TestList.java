package SmokeTestScope;

import Utils.MyCustomListener2;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by User on 11.04.2017.
 */
@Listeners ({MyCustomListener2.class})
public class TestList {

    @Test
    public void pass(){}
}
