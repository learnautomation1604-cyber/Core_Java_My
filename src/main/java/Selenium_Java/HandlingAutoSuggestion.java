package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class HandlingAutoSuggestion {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //
        WebDriverWait   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com");
        Thread.sleep(5000);

        //
        WebElement SearchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gh-ac']")));
        SearchBox.sendKeys("iphone");

        // Wait For the suggestion

        List<WebElement> suggestions = Collections.singletonList(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text()=iphone 15]"))));
        // Select the required suggestion

        for(WebElement suggestion : suggestions){

            if(suggestion.getText().equals("iphone")){
                suggestion.click();
                break;

            }

        }

        driver.quit();











    }
}
