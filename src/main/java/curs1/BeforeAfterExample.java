package curs1;

import org.testng.annotations.*;

public class BeforeAfterExample {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }

    @Test
    public void test1(){
        System.out.println("test 1");
    }

    @Test
    public void test2(){
        System.out.println("test 2");
    }


    @AfterClass
    public  void afterClass(){
        System.out.println("afterClass");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }

}
