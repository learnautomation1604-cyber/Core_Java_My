package CoreJava.AccessModifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class demon{

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("//input[@id='gh-ac']"));



    }






}