package curs4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.List;

public class SelectorExample {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://keybooks.ro/");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void elementsDisplayed() {
        //ID cssSelector
        WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
        System.out.println(loginMenu.getText());

        //class selector
        WebElement sloganElement = driver.findElement(By.cssSelector(".logo_slogan"));
        System.out.println(sloganElement.getText());

        //chained
        WebElement authorElement = driver.findElement(By.cssSelector(".column-1_6"));
        System.out.println(authorElement.getText());

        //clild
        WebElement authorElement2 = driver.findElement(By.cssSelector(".column-1_6>div>div>p"));
        System.out.println(authorElement2.getText());

        //multiple attributes
        WebElement menuEntry = driver.findElement(By.cssSelector(("li[class*='sc_tabs_title'][aria-expanded='true']")));
        System.out.println(menuEntry.getText());

        //wildcards,
        // incepe cu un anumit cuvant a[href^='the']
        List<WebElement> starsWith = driver.findElements(By.cssSelector("a[href^='the']"));
        for (WebElement books : starsWith) {
            System.out.println(books.getText());

            //se termin acu cu un anumit cuvant a[href$='garden']
            List<WebElement> endsWith = driver.findElements(By.cssSelector("a[href$='garden']"));
            for (WebElement books2 : endsWith) {
                System.out.println(books.getText());

                //contains word
                driver.get(("https://keybooks.ro/shop)"));
                WebElement categoryRomance = driver.findElement(By.cssSelector("a[aria-label~='Romance']"));
                categoryRomance.click();
                assertEquals(driver.getTitle(), "Romance - Booklovers");
                //driver.findElement(By.cssSelector(("img[class='logo_main']")).click();

                //not pseudo class
                /*List<WebElement> menuEntr = driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:not(.ui-tabs-active)"));
                for (WebElement ele : menuEntr) {
                    System.out.println(ele.getText());
                }*/

            //nth-child
            WebElement lastMenuEntry = driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:nth-child(4)"));
            System.out.println(lastMenuEntry.getText());
        }
    }
    }}


