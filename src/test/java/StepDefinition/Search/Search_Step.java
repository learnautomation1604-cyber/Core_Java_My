package StepDefinition.Search;

import PageObjects.Search_page;
import Utility.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;

public class Search_Step {

    @Given("User Lanc the url")
    public void user_lanc_the_url() {
        Search_page sp = new Search_page();
        sp.launchurl();
    }

    @When("User Enter Pr oductname Valid")
    public void user_enter_pr_oductname_valid() throws InterruptedException {
        Search_page sp = new Search_page();
        sp.entertheproductname();

    }

    @When("User Click the Search Button")
    public void user_click_the_search_button() throws InterruptedException {
        Search_page sp = new Search_page();
        sp.click_search_button();

    }

    @Then("User Verified the Product Search Functionality")
    public void user_verified_the_product_search_functionality() throws InterruptedException {
        Search_page sp = new Search_page();
        sp.verify_search_results();

    }

    @When("User Enter Productname Ivalid")
    public void user_enter_productname_ivalid() throws InterruptedException {


        Hooks.driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("*^*&^*&TIY&FIYTFT");

        Thread.sleep(3000);


    }

    @When("User Make The Empty Search")
    public void user_make_the_empty_search() {
        Hooks.driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("");



    }

    @Then("User Verfy the Empty Search")
    public void user_verfy_the_empty_search() {

        Hooks.driver.findElement(By.xpath("//h1[normalize-space()='All Categories']")).isDisplayed();

    }

    @When("User Enter the Productname {string}")
    public void user_enter_the_productname(String productname) {

        Hooks.driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(productname);




    }

    @Then("User Verify the search Results")
    public void user_verify_the_search_results() {

        Hooks.driver.findElement(By.xpath("//h1[@id='srp-results-heading']")).isDisplayed();

    }




}