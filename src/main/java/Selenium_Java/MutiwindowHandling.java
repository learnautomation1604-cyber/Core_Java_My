package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class MutiwindowHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.ebay.com");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("I phone 16 Pro");

        driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("(//div[@class='su-media-container s-card__media-wrapper'])[3]"));
        JavascriptExecutor kjs = (JavascriptExecutor) driver;
        kjs.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);

        String parentwindow = driver.getWindowHandle();
        System.out.println("parent window: " + parentwindow);


        driver.findElement(By.xpath("(//div[@class='su-media-container s-card__media-wrapper'])[3]")).click();

        Thread.sleep(2000);

        Set<String> AllWindow = driver.getWindowHandles();
        System.out.println(AllWindow);
        Thread.sleep(2000);
        for(String window : AllWindow){
            if(!window.equals(parentwindow)){
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.findElement(By.xpath("(//span[@class='ux-textspans ux-textspans--BOLD'])[1]")).click();
                driver.close();
                Thread.sleep(2000);
            }
        }




        driver.quit();


    }
}
