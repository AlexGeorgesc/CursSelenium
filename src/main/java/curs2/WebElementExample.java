package curs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebElementExample {
    WebDriver driver;

   @BeforeClass
    public void setUp(){

       System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://keytrainingtravelshop.herokuapp.com/login");

   }
    @AfterClass
    public void tearDown() throws  InterruptedException{
       Thread.sleep(4000);
                driver.quit();
    }
    @Test
    public void WebElementExample(){
       //verific ca exista
        //driver.findElement(By.id("email")).isEnabled();

        // sa dau click in el
        //driver.findElement(By.id("email")).click();

        //sa scriu in el
        //driver.findElement(By.id("email")).sendKeys("TestUser");

        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.isEnabled();
        usernameField.click();
        usernameField.sendKeys("TestUser");

    }



}
