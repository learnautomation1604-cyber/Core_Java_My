package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorstrategy {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        driver.findElement(By.cssSelector("input.gh-search-input.gh-tb.ui-autocomplete-input")).sendKeys("Dell Laptop");
        driver.findElement(By.id("gh-search-btn")).click();

//        driver.findElement(By.linkText("")).click();
//        driver.findElement(By.partialLinkText("")).click();
//        driver.findElement(By.className("")).click();
//        driver.findElement(By.name("")).click();
//        driver.findElement(By.xpath("")).click();
//        driver.findElements(By.tagName("a")).get(0).click();


         //Hyper link

//        driver.findElement(By.linkText("Sign in")).click();
//        driver.findElement(By.partialLinkText("regi")).click();


        driver.quit();






    }
}
