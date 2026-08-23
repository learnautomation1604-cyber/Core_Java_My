package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitConcepts_Selenium {

    public static void main(String[] args) {

        // Why synchronization needed - Avoid Exception - NosuchElementException, ElementNotIntractableException, ElementClickIntruptedException, StaleElementRefereceException
        // Types of synchronization - Implicit Exception, Explicit Exception, Fluent Exception
        // Default waiting time of the selenium - 0

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        // Implicit wait -Tells selium to wait for a specified amount of time when locating elements
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("I phone 16 Pro");
        driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();

        //  Explicit Wait -- Wait for a specific condition before continuing

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@id='srp-results-heading']")));
        element.click();

        // Fluent wait - Provides more control over polling frequency and exceptions to ignore

        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@id='srp-results-heading']")));
        element1.click();

        // Thread.sleep(3000) - Java Wait comment



























    }
}
