package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class tretd {

    public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();

            WebDriverWait wait = new WebDriverWait(
                    driver,
                    Duration.ofSeconds(10)
            );

            driver.manage().window().maximize();

            driver.get("https://www.ebay.com/");

            // 1. Search box
            WebElement searchBox = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//input[contains(@aria-label,'Search')]")
                    )
            );

            // 2. Enter search text
            searchBox.sendKeys("laptop");

            // 3. Wait for suggestion overlay
            List<WebElement> suggestions = wait.until(
                    ExpectedConditions.visibilityOfAllElementsLocatedBy(
                            By.xpath("//*[@role='listbox']//*[@role='option']")
                    )
            );

            // 5. Print suggestions
            for (WebElement suggestion : suggestions) {
                System.out.println(
                        "Suggestion: " + suggestion.getText()
                );
            }

            // 6. Verify laptop suggestion
            boolean found = false;

            for (WebElement suggestion : suggestions) {

                if (suggestion.getText()
                        .trim()
                        .equalsIgnoreCase("laptop hp")) {

                    found = true;
                    suggestion.click();
                    break;
                }
            }

            driver.quit();
        }

    }