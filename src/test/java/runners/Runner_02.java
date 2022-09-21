package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/MQA-2_TC_03.feature",
        glue = "stepdefinitions",
        dryRun = false,
        tags="@movita2"



)

public class Runner_02 {

}
