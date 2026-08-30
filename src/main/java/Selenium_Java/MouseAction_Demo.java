package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class MouseAction_Demo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Mouse Action

        Actions action = new Actions(driver);

        WebElement BuyElementinPageFooter = driver.findElement(By.xpath("//a[normalize-space()='Site map']"));
        action.moveToElement(BuyElementinPageFooter).perform();
        action.click(BuyElementinPageFooter).perform();

        WebElement newlocator = driver.findElement(By.xpath("//a[@href='#my ebay']"));
        action.contextClick(newlocator).perform();

        Thread.sleep(2000);
        action.doubleClick(newlocator).perform();
        Thread.sleep(2000);

        WebElement newlocator2 = driver.findElement(By.xpath("//a[normalize-space()='Change registration information']"));
        action.clickAndHold(newlocator2).perform();
        Thread.sleep(2000);
        action.release(newlocator2).perform();

        Thread.sleep(2000);

        WebElement element1 = driver.findElement(By.xpath("//a[@id='create-account-button-link']"));

//        action.moveToElement(element1, 50, 20).doubleClick().perform();
//        action.moveByOffset(100, 50).doubleClick().perform();

        Thread.sleep(2000);

        driver.navigate().to("https://testautomationpractice.blogspot.com/");

        // Scroll to the element
        // Drag and Drop

        WebElement source = driver.findElement(By.xpath(""));

        WebElement target = driver.findElement(By.xpath(""));

        action.dragAndDrop(source, target).perform();


        driver.quit();


    }

}
