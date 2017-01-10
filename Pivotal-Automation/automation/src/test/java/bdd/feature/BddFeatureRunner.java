package bdd.feature;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src\\resource\\login.feature",
        format = {"pretty", "html:reports/cucumber"})

public class BddFeatureRunner extends AbstractTestNGCucumberTests {

}
