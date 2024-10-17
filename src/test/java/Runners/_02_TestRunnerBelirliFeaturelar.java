package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeaturesFiles/_01_Login.feature",
        "src/test/java/FeaturesFiles/_02_Country.feature",
                "src/test/java/FeaturesFiles/_03_Citizienship.feature"},
        glue = {"StepDefinitions"}
)

public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {
}
