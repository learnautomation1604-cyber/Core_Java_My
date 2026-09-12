package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender_DateSelection {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/calendars/");
        driver.findElement(By.xpath("//input[@id='g1065-1-selectorenteradate']")).sendKeys("2026-09-07");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()='Submit']")).click();

        driver.quit();

        // Custome Calender/Date Picker
        // Dynamic data handling







    }
}
