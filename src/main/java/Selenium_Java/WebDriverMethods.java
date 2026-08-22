package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

public class WebDriverMethods {


    public static void main(String[] args) {

        // Web Driver Methods - get(), getTitel(), getCurrentUrl, getPageSource(), findElement(),
        // findElements(), close(), quit(), navigate().back(),navigate().forward(), navigate().refresh(),
        // manage().swithchTo()

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        String pagetitle = driver.getTitle();
        System.out.printf("Title: %s\n", pagetitle);
        String pagetitle2 = driver.getCurrentUrl();
        System.out.println(pagetitle2);
        String pagetitle3 = driver.getPageSource();
//        System.out.println(pagetitle3);
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("I phone 16 Pro");
        driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();
        boolean headingavailability = driver.findElement(By.xpath("//*[@id='srp-results-heading']")).isDisplayed();

        System.out.println("Availability of search result title: "+headingavailability);
        driver.navigate().to("https://www.ebay.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        // SwitchTo method used to handle alerts and iframes
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();




        driver.close();
        driver.quit();



    }
}
