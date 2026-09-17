package Selenium_Java.Cookie;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class CookiesExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // 1. Open the website
            driver.get("https://www.ebay.com");

            // 2. Create a new cookie
            Cookie testCookie = new Cookie(
                    "testAutomation",
                    "SeleniumJava"
            );

            driver.manage().addCookie(testCookie);

            System.out.println("Cookie added successfully");

            // 3. Get a cookie by name
            Cookie retrievedCookie =
                    driver.manage().getCookieNamed("testAutomation");

            System.out.println("Cookie Name  : " + retrievedCookie.getName());
            System.out.println("Cookie Value : " + retrievedCookie.getValue());

            // 4. Get all cookies
            Set<Cookie> allCookies = driver.manage().getCookies();

            System.out.println("\nAll Cookies:");

            for (Cookie cookie : allCookies) {
                System.out.println(
                        cookie.getName() + " = " + cookie.getValue()
                );
            }

            // 5. Delete a specific cookie
            driver.manage().deleteCookieNamed("testAutomation");

            System.out.println("\nCookie deleted successfully");

            // 6. Verify cookie deletion
            Cookie deletedCookie =
                    driver.manage().getCookieNamed("testAutomation");

            System.out.println("Cookie after deletion: " + deletedCookie);

        } finally {
            driver.quit();
        }
    }
}