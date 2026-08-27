package Selenium_Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertAndPopup {

    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();

        // Only Accept
        WebElement SourceOfAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        SourceOfAlert.click();
        Thread.sleep(2000);
        // Alert - Java's Interface
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

        // Accept and Cancel

        WebElement elementcancelaccept =  driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
        elementcancelaccept.click();
        WebElement SourceOfAlert1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        SourceOfAlert1.click();
        Thread.sleep(2000);
        // Alert - Java's Interface
        alert.accept();
        Thread.sleep(2000);
        SourceOfAlert1.click();
        Thread.sleep(2000);

       SourceOfAlert1.click();

        alert.dismiss();
        Thread.sleep(2000);

        // Alert with text box

        WebElement elementinputfield =  driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
        elementinputfield.click();

        WebElement SourceOfAlert2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        SourceOfAlert2.click();
        alert.sendKeys("Hey Mythili");
        alert.accept();

        WebElement SourceOfAlert3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        SourceOfAlert3.click();
        Thread.sleep(2000);
        SourceOfAlert3.sendKeys("Hey Mythili");
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);







        driver.quit();
    }
}
