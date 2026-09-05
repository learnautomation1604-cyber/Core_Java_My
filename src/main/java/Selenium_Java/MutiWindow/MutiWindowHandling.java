package Selenium_Java.MutiWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutiWindowHandling {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String Parentwindow = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());

        driver.switchTo().window(Parentwindow);
        System.out.println(driver.getTitle());






    }
}
