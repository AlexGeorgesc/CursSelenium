package curs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Homework {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

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
    public void elementsDisplayed(){
      assertTrue(driver.findElement(By.className("menu_user_login")).isDisplayed());
      WebElement login = driver.findElement(By.className("menu_user_login"));
      WebElement user = driver.findElement(By.name("log"));
      WebElement pass = driver.findElement(By.name("pwd"));
      assertFalse(user.isDisplayed());
      assertFalse(pass.isDisplayed());
      login.click();
      assertTrue(user.isDisplayed());
      assertTrue(pass.isDisplayed());

    }

}
