package Selenium_Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertAndPopup {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        // =========================
        // 1. Simple Alert
        // =========================

        WebElement element =
                driver.findElement(By.xpath("//button[@id='alertBtn']"));

        action.scrollToElement(element).perform();
        action.click(element).perform();

        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();

        System.out.println("Alert Text: " + alert.getText());

        alert.accept();

        Thread.sleep(2000);


        // =========================
        // 2. Confirm Alert - Cancel
        // =========================

        WebElement element1 =
                driver.findElement(By.xpath("//button[@id='confirmBtn']"));

        action.click(element1).perform();

        Thread.sleep(1000);

        // Switch to NEW alert
        alert = driver.switchTo().alert();

        System.out.println("Confirm Text: " + alert.getText());

        alert.dismiss();

        Thread.sleep(1000);


        // =========================
        // 3. Confirm Alert - Accept
        // =========================

        action.click(element1).perform();

        Thread.sleep(1000);

        // Switch to NEW alert
        alert = driver.switchTo().alert();

        alert.accept();

        Thread.sleep(1000);


        // =========================
        // 4. Prompt Alert - SendKeys
        // =========================

        WebElement element2 =
                driver.findElement(By.xpath("//button[@id='promptBtn']"));

        action.click(element2).perform();

        Thread.sleep(1000);

        // IMPORTANT:
        // Switch to the newly opened prompt
        alert = driver.switchTo().alert();

        System.out.println("Prompt Text: " + alert.getText());

        // Enter value
        alert.sendKeys("Hey Mythili");

        Thread.sleep(1000);

        // Click OK
        alert.accept();

        Thread.sleep(2000);


        // =========================
        // Close Browser
        // =========================

        driver.quit();
    }
}