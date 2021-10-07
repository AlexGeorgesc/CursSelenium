package curs4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigateExample {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @AfterClass
    public void tearDown() throws  InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void navigateExample(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.get("https://keybooks.ro");
        driver.get("http://www.emag.ro/");

        //driver.navigate().to("");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
