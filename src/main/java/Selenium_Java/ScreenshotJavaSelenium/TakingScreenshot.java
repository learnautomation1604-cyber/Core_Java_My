package Selenium_Java.ScreenshotJavaSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TakingScreenshot {

    public static  void main(String[] args) throws InterruptedException, IOException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String path ="C:\\Users\\LENOVO\\OneDrive\\Documents\\IntelliJ\\Selenium_Java_00\\src\\Screenshot";

        Files.copy(source.toPath(), Path.of(path,"screenshot11.png"));

        driver.get("https://www.ebay.com/");
        Thread.sleep(3000);

        File source1 = ts.getScreenshotAs(OutputType.FILE);
        Files.copy(source1.toPath(), Path.of(path,"screenshot1.png"));



        WebElement dropdown = driver.findElement(By.xpath("//*[@id='gh-cat']"));
//        dropdown.click();

        Select sel = new Select(dropdown);
        sel.selectByValue("625");


        File source2 = ts.getScreenshotAs(OutputType.FILE);
        Files.copy(source2.toPath(), Path.of(path,"screenshot2.png"));



        Thread.sleep(3000);
        sel.selectByVisibleText("Books");



        File source3 = ts.getScreenshotAs(OutputType.FILE);
        Files.copy(source3.toPath(), Path.of(path,"screenshot3.png"));

        driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();



        Thread.sleep(3000);

        File source4 = ts.getScreenshotAs(OutputType.FILE);
        Files.copy(source4.toPath(), Path.of(path,"screenshot5.png"));


        driver.quit();






    }



}
