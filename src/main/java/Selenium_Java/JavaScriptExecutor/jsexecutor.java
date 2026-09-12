package Selenium_Java.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");

        // javascript executor - Interface
        // Scroll to the element

        // Declaration
        WebElement element = driver.findElement(By.xpath(""));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("window.scrollTo(0,0)");
        js.executeAsyncScript("alert('Hello World!')");
        js.executeScript("arguments[0].click();");
        js.executeScript("arguments[0].scrollIntoView(true);", element);




        driver.quit();





    }
}
