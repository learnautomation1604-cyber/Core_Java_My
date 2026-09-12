package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumException {


    public static  void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        // No Such Element Exception

        driver.findElement(By.xpath("//textarea[@id='t6d']")).click();
        // TimeOut Exception
        // Element Not Interactable Exception
        // Element Click Intercepted Exception
        // Stale element reference exception
        // No Such Window Exception
        // No Alert present exception
        // Session Not created Exception


        driver.quit();


    }
}
