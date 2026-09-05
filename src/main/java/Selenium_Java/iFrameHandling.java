package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFrameHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-automation.com/iframes/");
        driver.manage().window().maximize();

        driver.switchTo().frame("iframe-1");

        driver.findElement(By.xpath("//div[@class='navbar__item dropdown dropdown--hoverable']")).click();

        Thread.sleep(3000);

        driver.quit();




    }
}
