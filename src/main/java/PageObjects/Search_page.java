package PageObjects;

import Utility.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_page {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='gh-ac']")
    private WebElement search_box;
    @FindBy(xpath = "//button[@id='gh-search-btn']")
    private WebElement search_button;
    @FindBy(xpath = "//h1[@id='srp-results-heading']")
    private WebElement Search_result_verification;

    public  void launchurl(){
        driver.get("https://www.ebay.com");
    }

    public  void entertheproductname(){
        Hooks.driver.findElement((By) search_box).sendKeys("iPhone");
    }

    public void click_search_button(){
        Hooks.driver.findElement((By)(search_button)).click();
    }

    public  void verify_search_results(){
        Hooks.driver.findElement((By)(Search_result_verification)).isDisplayed();
    }





}
