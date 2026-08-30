package Selenium_Java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.List;
import java.util.Locale;

public class WebTable {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://assertqa.com/practice/webtables");

        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//*[@data-cy='table-section']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        WebElement table = driver.findElement(By.xpath("//table[@id='employees-table']"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(WebElement row:rows){
            List<WebElement> cells = row.findElements(By.tagName("td"));

            for(WebElement cell:cells){

                System.out.println(cell.getText().trim()+ "\t");

            }

        }





        Thread.sleep(3000);



//
//        Actions action = new Actions(driver);
//        action.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(3000);
//        action.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(3000);
//        action.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(3000);
//


        driver.findElement(By.xpath("//*[@data-cy='table-section']")).isDisplayed();
        Thread.sleep(3000);




        driver.quit();


    }
}
