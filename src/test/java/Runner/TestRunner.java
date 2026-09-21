package Runner;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/Features",

        glue = {
                "src/main/java/Utility/Hooks",
                "src/test/java/StepDefinition/Search",

        },
        tags = "@Regression",

        plugin = {
                "pretty", "html:target/cucumber-report.html"


        },

        monochrome = true

)


public class TestRunner {
}
