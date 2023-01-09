package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        tags = "@ct19",
        glue = {"steps", "hooks"},
        plugin = {"pretty",
                "json:target/cucumber-report/cucumber.json"},
        monochrome = true


)
public class Runner {
}
