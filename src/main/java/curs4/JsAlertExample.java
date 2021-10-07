package curs4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JsAlertExample {
    WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @AfterClass
    public void tearDown() throws  InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(priority = 0)
    public void testJsAlert() throws InterruptedException {
        WebElement firstAlertButton = driver.findElement(By.cssSelector("button[onclick*='Alert']"));
        firstAlertButton.click();
        Alert jsAlert = driver.switchTo().alert();
        //driver.switchTo().alert().accept();
        Thread.sleep(3000);
        jsAlert.accept();
        WebElement result = driver.findElement(By.id("result"));
        assertEquals(result.getText(), "You successfully clicked an Alert");

    }
    @Test(priority = 1)
    public void testJSConfirm() throws InterruptedException {
        WebElement firstAlertButton = driver.findElement(By.cssSelector("button[onclick*='Confirm']"));
        firstAlertButton.click();
        Alert jsAlert = driver.switchTo().alert();
        //driver.switchTo().alert().accept();
        Thread.sleep(3000);
        jsAlert.accept();
        WebElement result = driver.findElement(By.id("result"));
        assertEquals(result.getText(), "You clicked: Cancel");
    }
    @Test(priority = 2)
    public void testJSPrompt() throws InterruptedException {
        WebElement firstAlertButton = driver.findElement(By.cssSelector("button[onclick*='Prompt']"));
        firstAlertButton.click();
        Alert jsAlert = driver.switchTo().alert();
        //driver.switchTo().alert().accept();
        Thread.sleep(3000);
        Alert jsAlert1 = driver.switchTo().alert();
        jsAlert1.sendKeys("test 123");
        jsAlert1.accept();
        WebElement result = driver.findElement(By.id("result"));
        assertEquals(result.getText(), "You entered: test 123");
    }
}
