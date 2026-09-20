package StepDefinition.Search;

import Utility.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;

public class step {

    @Given("User Lanc the url")
    public void user_lanc_the_url() {
        Hooks.driver.get("https://www.ebay.com");
    }

    @When("User Enter Pr oductname Valid")
    public void user_enter_pr_oductname_valid() throws InterruptedException {

        Hooks.driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iPhone");

        Thread.sleep(3000);
    }

    @When("User Click the Search Button")
    public void user_click_the_search_button() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//button[@id='gh-search-btn']")).click();

        Thread.sleep(3000);

    }

    @Then("User Verified the Product Search Functionality")
    public void user_verified_the_product_search_functionality() throws InterruptedException {

        Hooks.driver.findElement(By.xpath("//h1[@id='srp-results-heading']")).isDisplayed();
        Thread.sleep(3000);
    }

    @When("User Enter Productname Ivalid")
    public void user_enter_productname_ivalid() throws InterruptedException {


        Hooks.driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("*^*&^*&TIY&FIYTFT");

        Thread.sleep(3000);


    }

}