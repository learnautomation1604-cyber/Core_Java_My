package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomation {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("I phone 16 Pro");
        driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();

//        driver.close();
        driver.quit();
    }
}
