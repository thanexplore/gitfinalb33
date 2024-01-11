package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithTest {

    //test with TestNG annotation
    @Test
    public void test(){
        System.out.println("test");

        Assert.assertTrue(false, "this is a test message");
    }
}
