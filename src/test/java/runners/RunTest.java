package runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"classpath:stepDefinitions","classpath:hooks"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = {"@logo,@about"}
)
public class RunTest {
}
