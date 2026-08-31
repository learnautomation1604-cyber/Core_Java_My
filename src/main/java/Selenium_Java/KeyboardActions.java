package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ebay.com");
        Thread.sleep(3000);

        Actions action = new Actions(driver);


        for(int i=0; i<=25;i++){
            action.sendKeys(Keys.ARROW_DOWN).perform();
        }

        Thread.sleep(1000);

        for(int i=0; i<=25;i++){
            action.sendKeys(Keys.ARROW_UP).perform();
        }
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//button[@aria-label='Camera icon']"));

//        action.moveToElement(element).perform();
//        action.click().perform();

        WebElement input = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Hi Mythili");


        Thread.sleep(2000);
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);

//        action.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);
//        action.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);
//        action.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);



        driver.quit();








    }



}
