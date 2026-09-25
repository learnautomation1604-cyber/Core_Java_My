package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void before() {
        System.out.println("Before Hooks");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println("Driver initialized: " + driver);
    }

    @After
    public void after() {

        System.out.println("After Hooks");
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}