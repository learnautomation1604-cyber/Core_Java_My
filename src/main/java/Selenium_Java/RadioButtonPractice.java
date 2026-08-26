package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
        driver.manage().window().maximize();
        // Java Script

        WebElement Element = driver.findElement(By.xpath("//*[text()='Buying Format']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Element);

        WebElement Radiobuttion = driver.findElement(By.xpath("//label[@class='field__label--end']/following::*[text()='Auction']"));
        Radiobuttion.click();

        System.out.println("Radio button Is Enabled : "+Radiobuttion.isEnabled());

        System.out.println("Radio button Is Displayed : "+Radiobuttion.isDisplayed());
        System.out.println("Radio button Is Selected : "+Radiobuttion.isSelected());








        Thread.sleep(3000);

        driver.quit();


    }
}
