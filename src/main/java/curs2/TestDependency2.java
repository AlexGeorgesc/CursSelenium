package curs2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestDependency2 {


        @Test(groups = "smokeTests")
        public void method1(){
            assertTrue(false);
            System.out.println("smoke-Test1");
        }

        @Test(groups = "E2E Tests")
        public void method2(){
            System.out.println("Method 2");
        }

        @Test(dependsOnGroups= "method1", alwaysRun = true)
        public void method3(){
            System.out.println("Method 3");
        }
}
