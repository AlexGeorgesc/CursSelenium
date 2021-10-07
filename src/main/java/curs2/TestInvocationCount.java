package curs2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestInvocationCount {

    @Test
    public void method1(){
        System.out.println("Method 1");
    }

    @Test(invocationCount = 10, invocationTimeOut = 5000)
    public void method2(){
        //Thread.sleep(1000);
        System.out.println("Method 2");
    }

    @Test(timeOut = 3000)
    public void method3(){
        //Thread.sleep(4000);
       // System.out.println("Method 3");
    }

}
