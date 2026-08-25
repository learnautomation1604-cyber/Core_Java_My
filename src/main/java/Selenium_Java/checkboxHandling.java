package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class checkboxHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.walgreens.com/login.jsp?ru=%2F");
        driver.findElement(By.id("ShowCharacter")).click(); // Enabled

        WebElement checkbox = driver.findElement(By.id("ShowCharacter"));
        System.out.println("Is that check box selected ? "+checkbox.isSelected());
        System.out.println("Is that checkbox is displayed: ? "+checkbox.isDisplayed());
        System.out.println("Is that checkbox is enabled? ? "+checkbox.isEnabled());

        if(checkbox.isSelected()) {
            System.out.println("checkbox is selected");
        } else if (!checkbox.isSelected()) {
            System.out.println("checkbox is not selected");
        }








        driver.close();
        driver.quit();


    }
}
