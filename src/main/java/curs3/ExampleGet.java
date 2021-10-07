package curs3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class ExampleGet {
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

    @Test(priority = 0)
    public void getPageTitle(){
        String homePageTitle = driver.getTitle();
        assertEquals(homePageTitle, "Booklovers – Your Favorite Bookshelf!");
        WebElement shopMenuLink =  driver.findElement(By.linkText("BOOKS"));
        shopMenuLink.click();
        assertEquals(driver.getTitle(), "Products – Booklovers");
    }

    @Test(priority = 1)
    public void getCurrentUrl(){
        //WebElement shopHomeLink =  driver.findElement(By.className("logo_main"));
        //shopHomeLink.click();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(currentUrl, "https://keybooks.ro/");
        WebElement shopMenuLink =  driver.findElement(By.linkText("BOOKS"));
        shopMenuLink.click();
        assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
    }
    // @Test(priority = 2)
    public void getElementText(){
        WebElement quote = driver.findElement(By.cssSelector("h3[class*='sc_title']"));
        String quoteText = quote.getText();
        assertEquals(quoteText, "Inspire Daily Reading");
    }


}