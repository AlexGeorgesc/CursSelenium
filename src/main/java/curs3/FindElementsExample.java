package curs3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class FindElementsExample {
    WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://keybooks.ro/");

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void testListElements(){
        List<WebElement> books = driver.findElements(By.cssSelector("h3[class*='sc_title']"));
        books.get(2).click();

        driver.findElement(By.cssSelector("h3[class*='sc_title23']")).click();

    }
}
