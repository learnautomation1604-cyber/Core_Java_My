package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.ebay.com/");
        Thread.sleep(3000);


        WebElement dropdown = driver.findElement(By.xpath("//*[@id='gh-cat']"));
//        dropdown.click();

        Select sel = new Select(dropdown);
        sel.selectByValue("625");

        Thread.sleep(3000);
        sel.selectByVisibleText("Books");

        Thread.sleep(3000);




        Thread.sleep(3000);



        driver.quit();





    }
}
