package curs2;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AssertionExample {

    String actualTitle = "google";
    String expectedTitle = "google2";

    @Test
    public void checkTwoStringsAreEqual(){
        if(actualTitle.endsWith(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("The strings do not match!  Expected :" + expectedTitle + "but go : " + actualTitle);
        }
    }
    @Test
    public void checkStringEquality(){
        System.out.println("Line 1");
        assertEquals(actualTitle, expectedTitle);
        System.out.println("Line 2");
        assertNotNull(actualTitle);
        System.out.println("Line 3");
    }


}
