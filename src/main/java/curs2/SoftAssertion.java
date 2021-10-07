package curs2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.*;

public class SoftAssertion {

    @Test
    public void softAssert(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Soft assert incepe aici!");
        softAssert.assertTrue(false);
        System.out.println("Soft assert se termina aici!");
        softAssert.assertAll();
    }

    @Test
    public void hardAssert(){
        System.out.println("Hard assert incepe aici!");
        assertTrue(false);
        System.out.println("Hard assert se termina aici!");

    }


}
