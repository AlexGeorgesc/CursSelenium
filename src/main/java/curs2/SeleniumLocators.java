package curs2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SeleniumLocators {

    WebDriver driver;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://keybooks.ro/");

    }
    @AfterClass
    public void tearDown() throws  InterruptedException {
        Thread.sleep(4000);
        //driver.quit();
    }

    @Test
    public void testIdLocator(){
        WebElement menu = driver.findElement(By.id("menu_user"));
        JavascriptExecutor js  = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red;');", menu);
    }
    @Test
    public void testClassNameLocator() {
        WebElement sloganText = driver.findElement(By.className("logo_slogan"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red;');", sloganText);
    }
    @Test
    public void testNameLocator(){
        WebElement inputEmail = driver.findElement(By.name("email"));
        assertTrue(inputEmail.isEnabled());
    }


}
