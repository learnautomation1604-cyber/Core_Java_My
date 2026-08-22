package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchAndNavigation {

    public static void main(String[] args) throws InterruptedException {

        //Browser Launch Commands

        WebDriver driver = new ChromeDriver();
//        WebDriver Driver = new FirefoxDriver();
//        WebDriver driver = new EdgeDriver()


        // Navigation Commands

        driver.get("https://www.walgreens.com/");
//        driver.navigate().to("https://www.ebay.com");
        driver.findElement(By.xpath("//a[@class='standard-link__title']//span[contains(text(),'Vaccinations')]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        // Browser Information

       String pagetitle =  driver.getTitle();
        System.out.printf("page title: %s\n", pagetitle);
        String CurrentUrl= driver.getCurrentUrl();
        System.out.printf("Current url: %s\n", CurrentUrl);
        String pagesource = driver.getPageSource();
        System.out.printf("pagesource: %s\n", pagesource);

        // Browser closing
        driver.close();
        driver.quit();






    }
}
