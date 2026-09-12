package Selenium_Java.FileUploadAndDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAndDownload {

    public static void main(String[] args) throws InterruptedException {

        // Download
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com");

        Thread.sleep(2000);
        Actions action = new Actions(driver);

        WebElement FileDownload = driver.findElement(By.xpath("//a[normalize-space()='File Download']"));
        action.moveToElement(FileDownload).perform();
        Thread.sleep(2000);
        action.click(FileDownload).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@class,'wpdm-download-link download-on-click btn btn-primary')]")).click();
        Thread.sleep(2000);

        // Upload

        driver.get("https://practice-automation.com");
        Thread.sleep(2000);

        WebElement FileUpload = driver.findElement(By.xpath("//a[normalize-space()='File Upload']"));
        action.moveToElement(FileUpload).perform();
        Thread.sleep(2000);
        action.click(FileUpload).perform();
        Thread.sleep(2000);

        WebElement Uploadfilelocation = driver.findElement(By.xpath("//input[@id='file-upload']"));
        Uploadfilelocation.sendKeys("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Playwright++.txt");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='upload-btn']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='wpcf7-response-output']")).isDisplayed();
        Thread.sleep(2000);






        driver.quit();

    }
}
