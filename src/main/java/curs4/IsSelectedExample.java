package curs4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class IsSelectedExample {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //System.set.Property("webdriver...")
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://keybooks.ro/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void isSelectedExample(){
        WebElement login = driver.findElement(By.cssSelector("popup_login"));
        login.click();

        WebElement username = driver. findElement(By.id("log"));
        username.click();
        //assertTrue(username.isSelected());

        //isSelected--> attribute tupe: checkbox, radio, option
        WebElement checkbox = driver.findElement(By.id("rememberme"));
        assertFalse(checkbox.isSelected());
        checkbox.click();
        assertTrue(checkbox.isSelected());


    }
}
