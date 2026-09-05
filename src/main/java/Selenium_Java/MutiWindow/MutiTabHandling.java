package Selenium_Java.MutiWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MutiTabHandling {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String parentwindow = driver.getWindowHandle();
        System.out.println("parent window: " + parentwindow);

        driver.switchTo().newWindow(WindowType.TAB);
//        driver.switchTo().newWindow(WindowType.TAB);  - Important to shift different tab layers
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentwindow);
        driver.findElement(By.xpath("//textarea[@id='ti6dpd']")).sendKeys("Playwright");
//        driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();

//


























    }
}
