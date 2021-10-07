package curs3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SeleniumLocators2 {

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

    @Test(priority = 0)
    public void testNameLocator() {
        WebElement element = driver.findElement(By.tagName("em"));
        String elementText = element.getText();
        assertEquals(elementText, "Discover");
    }

    @Test(priority = 1)
    public void testLinkTextLocator() {
        WebElement link = driver.findElement(By.linkText("BOOKS"));
        link.click();
    }

    @Test(priority = 2)
    public void testLinkTextLocator2() {
        WebElement partialLink = driver.findElement(By.partialLinkText("Cooking"));
        partialLink.click();
    }

    /*@Test(priority = 3)
    public void testCaseCssSelector() {
        WebElement callText = driver.findElement(By.cssSelector("div[class='contact_phone_in_top']"));
        callText.click();
        System.out.println(callText.getText());
    }*/

    @Test(priority = 3)
    public void testXpathLocator() {
        WebElement callText= driver.findElement(By.xpath("//div[class='contact_phone_in_top']"));
        callText.click();

    }
}
